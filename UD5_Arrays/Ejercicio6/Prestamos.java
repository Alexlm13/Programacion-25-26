package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio6;
import UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5.*;

public class Prestamos {
    private String fechaPrestamo, fechaDevolucion;
    private Libro libro;
    private Cliente cliente;
    static int prestado=0;

    public Prestamos(String fechaPrestamo, String fechaDevolucion, Libro libro, Cliente cliente){
        this.fechaPrestamo=fechaPrestamo;
        this.fechaDevolucion=fechaDevolucion;
        this.libro=libro;
        this.cliente=cliente;
        prestado++;
    }

    public static int getPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return "Fecha del préstamo: "+fechaPrestamo+
        "\nFecha de devolución: "+fechaDevolucion+
        "\n"+libro+
        "-----------------\nCliente\n-----------------\n"+cliente+"\n";
    }
}


