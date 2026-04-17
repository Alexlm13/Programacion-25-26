package UD6_Herencias.Ejercicio8;

public class Revista extends Publicacion {
    //ATRIBUTOS
    private int num;
    
    //METODO CONSTRUCTOR
    public Revista(String ISBN, String titulo, int annoPub, int num){
        super(ISBN, titulo, annoPub);
    }

    //GETTERS Y SETTERS
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //toString
    @Override
    public String toString() {
        return super.toString();
    }
}
