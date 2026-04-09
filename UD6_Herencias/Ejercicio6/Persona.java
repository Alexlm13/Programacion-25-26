package Ejercicio6;

public abstract class Persona {
    protected String nombre, apellidos, fechaNacim;

    public Persona(String nombre, String apellidos, String fechaNacim){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNacim=fechaNacim;
    }

    //METODO MOSTRAR
    public void mostrar(){
        
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

}
