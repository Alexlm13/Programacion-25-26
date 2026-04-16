package Ejercicio10;

public abstract class Vehiculo {
    //ATRIBUTOS
    private static int vehiculosCreados=0;
    private static double kmTotales=0;
    private double kmRecorridos=0;

    //METODO CONSTRUCTOR
    public Vehiculo(){
        vehiculosCreados++;
    }

    //METODO ABSTRACTO ANDAR
    public abstract void andar();

    //GETTERS y SETTERS
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static void setVehiculosCreados(int vehiculosCreados) {
        Vehiculo.vehiculosCreados = vehiculosCreados;
    }

    public static double getKmTotales() {
        return kmTotales;
    }

    public static void setKmTotales(double kmTotales) {
        Vehiculo.kmTotales = kmTotales;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
