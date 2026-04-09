package Ejercicio6;

public class Alumno extends Persona{

    public Alumno(String nombre, String apellidos, String fechaNacim){
        super(nombre, apellidos, fechaNacim);
    }
    
    @Override
    public void mostrar() {
        System.out.println("Nombre: "+this.nombre+"\nApellidos: "+this.apellidos+"\nFecha de nacimiento: "+this.fechaNacim+"\nOcupación: Alumno");
    }
}
