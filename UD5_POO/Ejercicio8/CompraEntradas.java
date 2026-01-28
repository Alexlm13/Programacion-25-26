package Ejercicio8;

import java.util.*;

public class CompraEntradas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opc = 0;
        int tipo = 0;

        do {
            System.out.printf(
                    "-------Menú-------%n" +
                            "1. Mostrar número de entradas libres%n" +
                            "2. Vender entradas%n" +
                            "3. Salir%n" +
                            ">>> ");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Principal: " + principal.getEntradasPorVender());
                    System.out.println("Compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Vip: " + vip.getEntradasPorVender());
                    System.out.println("");
                    break;
                case 2:
                    int venta = 0;
                    do {
                        System.out.println("");
                        System.out.println("Que tipo de entrada quieres comprar?");
                        System.out.printf(
                                "1. Principal%n" +
                                        "2. Compra-Venta%n" +
                                        "3. Vip%n" +
                                        ">>> ");
                        tipo = entrada.nextInt();
                        System.out.println("");
                        switch (tipo) {
                            case 1:
                                System.out.println("Cuántas desea comprar?");
                                venta=entrada.nextInt();
                                principal.vender(venta);
                                System.out.println("Quedan: "+principal.getEntradasPorVender());
                                break;
                            case 2:
                                System.out.println("Cuántas desea comprar?");
                                venta=entrada.nextInt();
                                compraVenta.vender(venta);
                                System.out.println("Quedan: "+compraVenta.getEntradasPorVender());
                                break;
                            case 3:
                                System.out.println("Cuántas desea comprar?");
                                venta=entrada.nextInt();
                                vip.vender(venta);
                                System.out.println("Quedan: "+vip.getEntradasPorVender());
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Opción inválida, vuelva a seleccionar");
                                break;
                        }
                    } while (tipo != 4);

                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (opc != 3);
    }
}
