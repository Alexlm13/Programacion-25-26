package UD6_Herencias.Ejercicio2;

public class Persona {
    //Atributos
    protected String NIF;
    protected double altura;
    protected int edad;

    //constructor sin parametros
    public Persona(){
        this.edad=25;
        this.altura=1.75;
        this.NIF="11111111A";
    }

    //constructor con parametros
    public Persona(int edad, double altura, String NIF){
        this.edad=edad;
        this.altura=altura;
        this.NIF=NIF;
    }

    //Metodos
    public void hablar(){
        System.out.println("Puedo hablar");
    }

    public void comer(){
        System.out.println("Puedo comer");
    }

    //getters y setters
    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //toString
    @Override
    public String toString() {
        return "\nEdad: "+edad+"\nAltura: "+altura+"\nNIF: "+NIF;
    }
}
