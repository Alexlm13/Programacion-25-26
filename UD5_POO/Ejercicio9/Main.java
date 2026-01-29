package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Tiempo t1=new Tiempo(0, 30, 40);
        Tiempo t2=new Tiempo(0, 35, 20);
        Tiempo t3=t1.Suma(t2);
        
        System.out.println(t3);
    }
}
