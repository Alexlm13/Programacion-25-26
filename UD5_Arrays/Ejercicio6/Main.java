package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio6;

import UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5.Autor;
import UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5.Libro;

public class Main {
    public static void main(String[] args) {
        Autor autores[]=new Autor[]{
            new Autor("William Shakespeare", "Británico")
        };

        Libro libros[]=new Libro[]{
            new Libro("L001", "Hamlet", autores[0])
        };

        Cliente clientes[]=new Cliente[]{
            new Cliente("Alejandro López Martínez", "77145131A")
        };

        Prestamos prestamo[]=new Prestamos[]{
            new Prestamos("13/02/2026", "24/08/26", libros[0], clientes[0])
        };

        for (Prestamos prestamos : prestamo) {
            System.out.println(prestamos);
        }

        System.out.println("Libros en préstamo: "+Prestamos.getPrestado());
    }
}
