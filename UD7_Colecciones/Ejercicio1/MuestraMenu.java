package UD7_Colecciones.Ejercicio1;

public class MuestraMenu {
    public static void main(String[] args) {
        Menu menu=new Menu();
        int opc=0;

        menu.creaOpcion("Primera opción");
        menu.creaOpcion("Segunda opción");
        menu.creaOpcion("Tercera opción");
        menu.creaOpcion("Salir");

        do {
            System.out.println("--- MENÚ ---");
            menu.muestraMenu();
            System.out.println("------------");
            System.out.print(">>> ");
            opc=menu.capturaOpcion();
            switch (opc) {
                case 1:
                    System.out.println("Seleccionaste la primera opción.");
                    break;
                case 2:
                    System.out.println("Seleccionaste la segunda opción.");
                    break;
                case 3:
                    System.out.println("Seleccionaste la tercera opción.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opc!=4);
    }
}