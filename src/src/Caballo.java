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

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public void setComidaFavorita(String comidaFavorita) {
        this.comidaFavorita = comidaFavorita;
    }

    public boolean isCompetidor() {
        return competidor;
    }

    public void setCompetidor(boolean competidor) {
        this.competidor = competidor;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caballo(){
        Random random = new Random();
        genero = random.nextBoolean();
        altura = random.nextInt(100, 200);
        potencia = random.nextInt(4,9);
        comidaFavorita = Constantes.COMIDAFAVORITA[random.nextInt(Constantes.COMIDAFAVORITA.length)];
        boolean competidor = random.nextBoolean();
        nacimiento = new Fecha();
        color =  new String[random.nextInt(1,3)];
        for (int i = 0; i < color.length; i++){
            color[i] = Constantes.COLOR[random.nextInt()];
            for (int j = 0; j <= i; j++){
                if (color[i].equals(color[j])){
                    color[i] = null;
                    i--;
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
        return (genero?"La yegua":"El caballo") + nombre + " mide " + altura + "cm, tiene una potencia de " + potencia + " caballos, su comida favorita es " + comidaFavorita.toLowerCase() + ", " + (competidor?"no":"si") + " es competidor, nació el " + nacimiento + " y es de color " + color[0].toLowerCase();
    }
}
