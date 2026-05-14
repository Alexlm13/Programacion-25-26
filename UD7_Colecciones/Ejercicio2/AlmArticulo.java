package Ejercicio2;

import java.util.ArrayList;

public class AlmArticulo {
    private ArrayList<Articulo> articulos=new ArrayList<>();
    private int totalArticulos;



    public boolean almacena(Articulo a){
        articulos.add(a);
        totalArticulos++;
        return true;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }
    
    public int getTotalArticulos() {
        return totalArticulos;
    }

    public void eliminar(Articulo a){
        articulos.remove(a);
        totalArticulos--;
    }
}
