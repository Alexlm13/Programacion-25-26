package Relacion8_Metodos.Ejercicio3;
import java.util.*;

public class ejercicio3 {
    public static void linea(char caracter, int repeticiones){

        for (int i = repeticiones; i > 0; i--) {
            System.out.print(caracter);
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n;

        System.out.print("Introduzca la altura de la figura: ");
        n=entrada.nextInt();

        for (int i = n; i >= 1; i--) {
            linea('*', i);
        }

    }
}
