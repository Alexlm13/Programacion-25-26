package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5;

public class Libro {
    private String codigo, titulo;
    private Autor autor;
    static int contLibro;

    public Libro(String codigo, String titulo, Autor autor){
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        contLibro++;
    }

    public static int getContLibro() {
        return contLibro;
    }

    @Override
    public String toString() {
        return "-----------------\nLibro: "+titulo+"\nCódigo: "+codigo+"\n-----------------\nAutor\n"+autor;
    }
}