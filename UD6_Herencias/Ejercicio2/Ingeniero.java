package UD6_Herencias.Ejercicio2;

public class Ingeniero extends Persona {

    //Metodo constructor
    public Ingeniero(int edad, double altura, String NIF){
        super(edad, altura, NIF);
        this.edad=edad;
        this.altura=altura;
        this.NIF=NIF;
    }
    
    //Metodos
    public void razonar(){
        System.out.println("Puedo razonar");
    }

    public void trabajarEnGrupo(){
        System.out.println("Puedo trabajar en grupo");
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+"\nIngeniero";
    }

}
