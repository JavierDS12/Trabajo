import java.util.Scanner;
public class EntradaSalida {
    public static void salidaTexto(String texto){
        System.out.println(texto);
    }
    public static String entradaTexto(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
