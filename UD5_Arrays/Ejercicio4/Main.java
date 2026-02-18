package UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio4;
import java.util.*;

import UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio2.Articulo;


public class Main {
    public static void main(String[] args) {
        GestorArticulo gestor=new GestorArticulo(10);
        Scanner entrada=new Scanner(System.in);
        int opc=0;
        String codigo, descripcion;
        int cantidad;
        do {
            System.out.print("""
                    ----------MENÚ---------
                    1. Entrada automatizada
                    2. Listado
                    3. Alta
                    4. Baja
                    5. Entrada de mercancia
                    6. Salida de mercancia
                    7. Salir
                    -----------------------
                    Seleccione una opción: 
                    """);
            opc=entrada.nextInt();
            entrada.nextLine();//limpio bufer
            System.out.println("");
            switch (opc) {
                case 1:
                    gestor.entradaAutomatizada();
                    System.out.println("");
                    break;
                case 2:
                    gestor.lista();
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Indique el código y descripción del artículo a añadir");
                    System.out.print("Código: ");
                    codigo=entrada.nextLine();

                    System.out.println("Descripción: ");
                    descripcion=entrada.nextLine();
                    
                    System.out.println("");

                    Articulo articulo=new Articulo(codigo, descripcion);
                    System.out.println(gestor.alta(articulo));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Introduzca el codigo del artículo que quieras dar de baja");
                    System.out.print("Código: ");
                    codigo=entrada.nextLine();

                    gestor.baja(codigo);
                    System.out.println("");
                    break;
                case 5:
                    
                    System.out.println("Indique el código y la cantidad de mercancia que va a entrar");
                    System.out.print("Código: ");
                    codigo=entrada.nextLine();

                    System.out.print("Cantidad: ");
                    cantidad=entrada.nextInt();

                    System.out.println(gestor.entradaMercancia(codigo, cantidad));
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Indique el código y la cantidad de mercancia que va a salir");
                    System.out.print("Código: ");
                    codigo=entrada.nextLine();

                    System.out.print("Cantidad: ");
                    cantidad=entrada.nextInt();

                    System.out.println(gestor.salidaMercancia(codigo, cantidad));
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción no correcta, elija de nuevo.");
                    System.out.println("");
                    break;
            }
        } while (opc!=7);
        entrada.close();
    }
}
