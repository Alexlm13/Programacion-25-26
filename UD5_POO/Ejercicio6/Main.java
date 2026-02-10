package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio6;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Fraccion f1=new Fraccion();
        Fraccion f2=new Fraccion();

        int num1, num2, den1, den2;
        Fraccion r1, r2;

        System.out.println("Ingrese los numeradores y los denominadores");
        System.out.println("Primer numerador:");
        num1=entrada.nextInt();
        System.out.println("Primer denominador:");
        den1=entrada.nextInt();
        System.out.println("Segundo numerador:");
        num2=entrada.nextInt();
        System.out.println("Segundo denominador");
        den2=entrada.nextInt();

        f1.setFraccion(num1, den1);
        f2.setFraccion(num2, den2);

        r1=Fraccion.Multiplica(f1,f2);
        System.out.printf("El resultado de la multiplicacion es: %d/%d%n",r1.getDenominador(), r1.getNumerador());

        r2=Fraccion.Divide(f1, f2);
        System.out.printf("El resultado de la division es: %d/%d%n",r2.getDenominador(),r2.getNumerador());

        r1.Invierte();
        System.out.printf("Invertida: %d/%d%n",r1.getDenominador(), r1.getNumerador());

        r2.Simplifica();
        System.out.printf("Simplificada: %d/%d",r2.getDenominador(),r2.getNumerador());

    }
}
