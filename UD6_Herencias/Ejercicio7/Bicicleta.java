package Ejercicio7;
import java.util.*;

public class Bicicleta extends Vehiculo{
    //ATRIBUTOS
    private Scanner entrada=new Scanner(System.in);
    private double avanza;

    //METODO CONSTRUCTOR
    public Bicicleta(){

    }

    //METODO ANDAR
    public void andar(){
        System.out.println("¿Cuántos km quieres que avance?");
        avanza=entrada.nextDouble();
        entrada.nextLine(); //Limpiar buffer
        setKmRecorridos(this.getKmRecorridos()+avanza);
        Vehiculo.setKmTotales(Vehiculo.getKmTotales()+avanza);
        System.out.println("Andas con la bicicleta: "+avanza+"km");
    }

    //METODO CABALLITO
    public void caballito(){
        System.out.println("Haces un caballito con la bicicleta.");
    }

    //GETTER kmRecorridos
    @Override
    public double getKmRecorridos() {
        return super.getKmRecorridos();
    }
}
