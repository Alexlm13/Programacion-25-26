package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        Articulo articulos[]=new Articulo[]{
            new Articulo("C001", "Ratón Logitech"),
            new Articulo("C002", "Monitor LG"),
            new Articulo("C003", "Portátil HP")
        };

        for (Articulo articulo : articulos) {
            System.out.println(articulo+"\n");
        }
    }
}
