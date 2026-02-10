package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        Mi_bicicleta bici1=new Mi_bicicleta();

        System.out.println("Color: "+bici1.getColor());
        System.out.println("Velocidad actual: "+bici1.getVelocidad());
        System.out.println("Aumentamos la velocidad");
        bici1.Avanzar();
        System.out.println("La marcha es: "+bici1.getMarcha());
        bici1.CambiarMarcha(3);
        System.out.println("Frenamos");
        bici1.Frenar();
        bici1.CambiarMarcha(0);
    }
}
