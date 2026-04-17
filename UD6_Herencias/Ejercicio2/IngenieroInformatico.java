package UD6_Herencias.Ejercicio2;

public class IngenieroInformatico extends Ingeniero{

    //Metodo constructor
    public IngenieroInformatico(int edad, double altura, String NIF){
        super(edad, altura, NIF);
        this.edad=edad;
        this.altura=altura;
        this.NIF=NIF;
    }
    
    //Metodo
    public void crearPrograma(){
        System.out.println("Puedo crear programas");
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+"Informático";
    }
}
