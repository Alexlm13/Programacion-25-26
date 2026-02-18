package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5;

public class Biblioteca {
    public static void main(String[] args) {
        Autor autores[]=new Autor[]{
            new Autor("William Shakespeare", "Británico"),
            new Autor("Miguel de Cervantes", "Español")
        };

        Libro libros[]=new Libro[]{
            new Libro("L001", "Romeo y Julieta", autores[0]),
            new Libro("L002", "Hamlet", autores[0]),
            new Libro("L003", "Otelo", autores[0]),
            new Libro("L004", "Don Quijote de la Mancha", autores[1]),
            new Libro("L005", "La Galatea", autores[1])
        };

        for (Libro libro : libros) {
            System.out.println(libro);
        }

        System.out.println("Cantidad de libros: "+Libro.getContLibro());
        System.out.println("Cantidad de autores: "+Autor.getContAutor());
    }
}