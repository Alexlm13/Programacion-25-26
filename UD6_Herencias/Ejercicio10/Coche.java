package Ejercicio10;
import java.util.*;

public class Coche extends Vehiculo implements Arrancable{
    //ATRIBUTOS
    private Scanner entrada=new Scanner(System.in);
    private double avanza;
    private boolean encendido;

    //METODO CONSTRUCTOR
    public Coche(){
        encendido=false;
    }

    //METODO ANDAR
    @Override
    public void andar(){
        if (encendido==false) {
            System.out.println("El coche está apagado, no puede avanzar.");
        }else{
        System.out.println("¿Cuántos km quieres avanzar?");
        avanza=entrada.nextDouble();
        entrada.nextLine();//Limpiar buffer
        setKmRecorridos(this.getKmRecorridos()+avanza);
        Vehiculo.setKmTotales(Vehiculo.getKmTotales()+avanza);
        System.out.println("Andas con el coche: "+avanza+"km.");
        }
    }

    //METODO QUEMARRUEDA
    public void quemarRueda(){
        System.out.println("Quemas rueda con el coche.");
    }

    //METODOS INTERFACE ARRANCABLE
    @Override
    public void arrancar() {
        if (encendido==false) {
            encendido=true;
        }else{
            System.out.println("El coche ya estaba arrancado.");
        }
        
    }

    @Override
    public void detener() {
        if (encendido==false) {
            System.out.println("El coche ya está detenido.");
        }else{
            encendido=false;
        }
    }

    @Override
    public boolean estaArrancado() {
        if (encendido==true) {
            System.out.println("El coche está arrancado.");
            return true;
        }else{
            System.out.println("El coche está apagado.");
        }
        return false;
    }

    @Override
    public double getKmRecorridos() {
        return super.getKmRecorridos();
    }
}
