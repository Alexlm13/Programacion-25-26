package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio4;

public class Autobus {
    //ATRIBUTOS
    String matricula;
    String modelo;
    double potenciaCV;
    int numeroPlazas;

    //CONSTRUCTOR
    public Autobus(String matricula, String modelo, double potenciaCV, int numeroPlazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.numeroPlazas = numeroPlazas;
    }

    //METODOS
    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public double getPotenciaCV() {
        return potenciaCV;
    }
    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    //toString
    @Override
    public String toString() {
        return "Matricula: "+matricula+"\nModelo: "+modelo+"\nCV: "+potenciaCV+"\nPlazas: "+numeroPlazas+"\n";
    }
}
