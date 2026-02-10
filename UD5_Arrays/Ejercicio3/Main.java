package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio3;

import UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio2.Articulo;

public class Main {
    public static void main(String[] args) {
      Articulo a1=new Articulo("C001", "Ratón Logitech");
      Articulo a2=new Articulo("C002", "Monitor HP");

      int tamaño=2;

      PruebaArticulo prueba=new PruebaArticulo(tamaño);

      prueba.Almacena(a1);
      prueba.Almacena(a2);

      System.out.println(prueba);
    }
}
