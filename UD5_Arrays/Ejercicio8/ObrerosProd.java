package UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio8;

import java.util.Scanner;

public class ObrerosProd {
    // ATRIBUTOS
    Scanner entrada = new Scanner(System.in);
    private String nombres[];
    private int produccion[][];
    private int totProd[];
    private int totMes[];
    private int toTotProd;

    // METODO CONSTRUCTOR
    public ObrerosProd() {
        nombres = new String[20];
        produccion = new int[20][6];
        totProd = new int[20];
        totMes = new int[6];
        toTotProd = 0;
    }

    // METODOS
    public void establecerNombres() {
        System.out.println("Escriba los nombres de los 20 obreros: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Obrero " + (i + 1) + "/20: ");
            nombres[i] = entrada.nextLine();
        }
    }

    public void establecerProduccion() {
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("Producción de " + nombres[i] + " en el mes " + (j + 1) + ": ");

                produccion[i][j] = entrada.nextInt();
            }
        }
        entrada.nextLine(); // limpio buffer
    }

    public void calcularTotProd() {
        for (int i = 0; i < nombres.length; i++) {
            totProd[i] = 0;
            for (int j = 0; j < 6; j++) {
                totProd[i] += produccion[i][j];
            }
        }
    }

    public void calcularTotMes() {
        for (int j = 0; j < 6; j++) {
            totMes[j] = 0;
            for (int i = 0; i < nombres.length; i++) {
                totMes[j] += produccion[i][j];
            }
        }
    }

    public void calcularToTotProd() {
        toTotProd = 0;
        for (int i = 0; i < nombres.length; i++) {
            toTotProd += totProd[i];
        }
    }

    public void mostrarInforme() {
        System.out.printf("%-20s", "NOMBRE");
        for (int i = 1; i <= 6; i++) {
            System.out.printf("%6s", "MES" + i);
        }
        System.out.printf("%10s\n", "TOTAL");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%-20s", nombres[i]);
            for (int j = 0; j < 6; j++) {
                System.out.printf("%6d", produccion[i][j]);
            }
            System.out.printf("%10d\n", totProd[i]);
        }
        System.out.printf("%-20s", "TOTAL");
        for (int j = 0; j < 6; j++) {
            System.out.printf("%6d", totMes[j]);
        }
        System.out.printf("%10d\n", toTotProd);
    }

    // GETTERS
    public Scanner getEntrada() {
        return entrada;
    }

    public String[] getNombres() {
        return nombres;
    }

    public int[][] getProduccion() {
        return produccion;
    }

    public int[] getTotProd() {
        return totProd;
    }

    public int[] getTotMes() {
        return totMes;
    }

    public int getToTotProd() {
        return toTotProd;
    }

}