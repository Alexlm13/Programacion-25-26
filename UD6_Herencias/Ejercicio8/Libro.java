package UD6_Herencias.Ejercicio8;

public class Libro extends Publicacion implements Prestable{
    //ATRIBUTOS
    private boolean prestado;
    
    //METODO CONSTRUCTOR
    public Libro(String ISBN, String titulo, int annoPub){
        super(ISBN, titulo, annoPub);
        prestado=false;
    }

    //METODOS INTERFAZ
    @Override
    public void presta() {
        if (prestado==false) {
            prestado=true;
        }else{
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
    }

    @Override
    public void devuelve() {
        if (prestado==true) {
            prestado=false;
        }else{
            System.out.println("Ese libro ya ha sido devuelto.");
        }
    }

    @Override
    public boolean estaPrestado() {
        if (prestado==true) {
            return true;
        }
        return false;
    }

    //GETTER
    public boolean isPrestado() {
        return prestado;
    }

    //toString
    @Override
    public String toString() {
        if (prestado==false) {
            return super.toString()+" (no prestado)";
        }else{
            return super.toString()+" (prestado)";
        }
    }
}
