package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio2;

public class Prueba2 {
    public static void main(String[] args) {
        Articulo articulo[]=new Articulo[3];
        articulo[0]=new Articulo("C001", "Ratón Logitech");
        articulo[1]=new Articulo("C002", "Monitor LG");
        articulo[2]=new Articulo("C003", "Portátil HP");

        for (Articulo articulo2 : articulo) {
            System.out.println(articulo2+"\n");
        }
    }
}
