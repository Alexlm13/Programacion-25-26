package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio5;

public class Autor {
    private String nombre, nacionalidad;
    static int contAutor=0;

    public Autor(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
        contAutor++;
    }

    public static int getContAutor() {
        return contAutor;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nNacionalidad: "+nacionalidad+"\n";
    }
}
