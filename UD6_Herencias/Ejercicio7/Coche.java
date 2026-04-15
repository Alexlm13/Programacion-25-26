package Ejercicio7;
import java.util.*;

public class Coche extends Vehiculo{
    //ATRIBUTOS
    private Scanner entrada=new Scanner(System.in);
    private double avanza;

    //METODO CONSTRUCTOR
    public Coche(){

    }

    //METODO ANDAR
    @Override
    public void andar(){
        System.out.println("¿Cuántos km quieres avanzar?");
        avanza=entrada.nextDouble();
        entrada.nextLine();//Limpiar buffer
        setKmRecorridos(this.getKmRecorridos()+avanza);
        Vehiculo.setKmTotales(Vehiculo.getKmTotales()+avanza);
        System.out.println("Andas con el coche: "+avanza+"km");
    }

    //METODO QUEMARRUEDA
    public void quemarRueda(){
        System.out.println("Quemas rueda con el coche.");
    }

    @Override
    public double getKmRecorridos() {
        return super.getKmRecorridos();
    }
}
