package Ejercicio4;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        HashSet<Integer> numeros=new HashSet<>();
        int num=0, suma=0;

        System.out.println("Escriba 5 números (NO DEBEN REPETIRSE)");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número ("+(i+1)+"/5): ");
            num=entrada.nextInt();
            numeros.add(num);
        }

        for (int i : numeros) {
            suma+=i;
        }

        System.out.println("Suma de los números es: "+suma);
    }
}
