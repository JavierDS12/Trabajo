public class Menu {
    public static void opcionesMenuCaballo(){
        boolean salida = false;
        do {
            EntradaSalida.salidaTexto("Bienvenido al programa de caballos. ¿Desea una entrada de datos manual o aleatoria? A. Aleatorio B. Manual S. Salir");
            char opcion = EntradaSalida.entradaCaracter();
            switch (opcion){
                case 'A':
                    EntradaSalida.salidaTexto("Cargando caballo de menra aleatoria...");
                    Caballo caballo = new Caballo();
                    EntradaSalida.salidaTexto("El caballo resultante es el siguiente:");
                    EntradaSalida.salidaTexto(caballo.toString());
                    EntradaSalida.salidaTexto("Cargando caballo en el array");
                    ArraysCaballos.cargarCaballos(caballo);
            }
        }while(!salida);
        }
    }
