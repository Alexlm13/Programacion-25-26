package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio1;

import UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio4.*;
import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Autobus[] estacion = new Autobus[4];
        String matricula = "", modelo = "";
        double caballos = 0;
        int plazas = 0;

        for (int i = 0; i < estacion.length; i++) {
            System.out.println("Introduzca los valores de los autobuses ("+(i+1)+"/4)");
            System.out.print("Matricula: \n");
            matricula = entrada.nextLine();
            System.out.print("Modelo: \n");
            modelo = entrada.nextLine();
            System.out.print("CV: \n");
            caballos = entrada.nextDouble();
            System.out.print("Plazas: \n");
            plazas = entrada.nextInt();
            entrada.nextLine(); // LIMPIAR EL BUFFER

            estacion[i] = new Autobus(matricula, modelo, caballos, plazas);
        }

        for (Autobus autobus : estacion) {
            System.out.println(autobus);
        }
    }
}
