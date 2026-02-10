package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Autobus autobus=new Autobus();
        int plazas=50;

        autobus.setNumeroPlazas(plazas);

        System.out.println("El número de plazas es: "+autobus.getNumeroPlazas());
    }
}
