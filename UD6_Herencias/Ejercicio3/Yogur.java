package Ejercicio3;

public class Yogur {
    protected double calorias;

    public Yogur(){
        this.calorias=120.5;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Yogur\nCalorías: "+getCalorias();
    }
}
