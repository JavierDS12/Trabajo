import java.util.Random;
public class Caballo {
    private boolean genero; //false hembra true macho
    private int altura;
    private int potencia;
    private String comidaFavorita;
    private boolean competidor; //false no competidor true competidor
    private Fecha nacimiento;
    private String [] color;
    private String nombre;
    public Caballo(boolean genero, int altura, int potencia, String comidaFavorita, boolean competidor, Fecha nacimiento, String[] color){

    }
    public Caballo(){
        Random random = new Random();
        genero = random.nextBoolean();
        altura = random.nextInt(100, 200);
        potencia = random.nextInt();
        comidaFavorita = Constantes.COMIDAFAVORITA[random.nextInt(Constantes.COMIDAFAVORITA.length)];
        boolean competidor = random.nextBoolean();
        nacimiento = new Fecha();
        color =  new String[random.nextInt(2,3)];
        for (int i = 0; i < color.length; i++){
            color[i] = Constantes.COLOR[random.nextInt()];
            for (int j = 0; j <= i; j++){
                if (color[i].equals(color[j])){
                    color[i] = null;
                }
            }
        }
        if (genero){
            nombre=Constantes.MARES[random.nextInt(Constantes.MARES.length)];
        } else {
            nombre=Constantes.STALLIONS[random.nextInt(Constantes.STALLIONS.length)];
        }
    }
    public  String toString(){
        return (genero?"La yegua":"El caballo") + nombre;
    }
}
