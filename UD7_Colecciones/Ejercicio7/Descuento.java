package Ejercicio7;

public enum Descuento {
    ECODTO1(0.10), ECODTO2(0.20);
    private double porcentaje;
    
    private Descuento(double porcentaje) {
        this.porcentaje=porcentaje;
    }

    public double getPorcentaje(){
        return porcentaje;
    }
}