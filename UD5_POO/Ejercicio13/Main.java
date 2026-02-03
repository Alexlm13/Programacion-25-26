package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        Cubo c1=new Cubo(10, 5);
        Cubo c2=new Cubo(8, 2);

        //prueba llenar
        System.out.println(c1.llenar(3)); //funcional
        System.out.println(c1.llenar(5)); //fallo
        System.out.println();

        //prueba vaciar
        System.out.println(c2.vaciar(1)); //funcional
        System.out.println(c2.vaciar(5)); //fallo
        System.out.println();

        //prueba verter
        c1.vertir(c2, 4); //funcional
        c1.vertir(c2, 10); //fallo
        System.out.println();

        //estado final
        System.out.printf("Estado final de los cubos:\nCubo 1: %.1f/%.1f litros\nCubo 2: %.1f/%.1f litros",c1.getContenido(), c1.getCapacidad(),c2.getContenido(),c2.getCapacidad());
    }
}
