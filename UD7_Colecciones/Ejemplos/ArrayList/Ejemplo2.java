package UD7_Colecciones.Ejemplos.ArrayList;

import java.util.*;

public class Ejemplo2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        ArrayList<Integer> numeros=new ArrayList<>();
        int n;
        do {
            System.out.println("Introduce números enteros, usa 0 para terminar");
            System.out.print("Número: ");
            n=entrada.nextInt();
            if (n!=0) {
                numeros.add(n);
            }
        } while (n!=0);

        System.out.println("Ha introducido: "+numeros.size()+" números");

        //muestro array completo
        System.out.println(numeros);

        //recorrido usando foreach para sumar los elementos
        double suma=0;
        for (Integer i : numeros) {
            suma=suma+i;
        }
        System.out.println("Suma: "+suma);
        System.out.println("Media; "+suma/numeros.size());
    }
}
