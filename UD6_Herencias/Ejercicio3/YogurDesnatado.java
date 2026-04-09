package Ejercicio3;

public class YogurDesnatado extends Yogur {
    
    public YogurDesnatado(){
        super();
    }

    @Override
    public String toString() {
        return "Yogur desnatado\nCalorias: "+getCalorias()/2;
    }

}
