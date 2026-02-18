package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio6;

public class Cliente {
    private String nombre, dni;
    static int cantCliente=0;

    public Cliente(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        cantCliente++;
    }

    public static int getCantCliente() {
        return cantCliente;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\ndni: "+dni;
    }
}
