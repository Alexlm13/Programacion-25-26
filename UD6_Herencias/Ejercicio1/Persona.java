package UD6_Herencias.Ejercicio1;

public class Persona {
    //atributos
    private String NIF;
    private double altura;
    private int edad;

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
        return "Edad: "+edad+"\nAltura: "+altura+"\nNIF: "+NIF;
    }
}
