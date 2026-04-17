package UD6_Herencias.Ejercicio8;

public abstract class Publicacion {
    //atributos
    private String ISBN;
    private String titulo;
    private int annoPub;

    //METODO CONSTRUCTOR
    public Publicacion(String ISBN, String titulo, int annoPub){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.annoPub=annoPub;
    }

    //GETTERS Y SETTERS
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnnoPub() {
        return annoPub;
    }

    public void setAnnoPub(int annoPub) {
        this.annoPub = annoPub;
    }

    //toString
    @Override
    public String toString() {
        return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+annoPub;
    }
}
