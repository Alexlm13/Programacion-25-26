package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio3;
import UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio2.Articulo;

public class PruebaArticulo {
    //ATRIBUTOS
    private Articulo articulos[];
    private int tamañoArray;
    static int objetoAlmacenado=0;

    //CONSTRUCTOR
    public PruebaArticulo(int tamañoArray){
        this.tamañoArray=tamañoArray;
        this.articulos=new Articulo[tamañoArray];
    }

    //METODO ALMACENA
    public boolean Almacena(Articulo a1){
        if (objetoAlmacenado<tamañoArray) {
            articulos[objetoAlmacenado]=a1;
            objetoAlmacenado++;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String articulo="";
        for (int i = 0; i < objetoAlmacenado; i++) {
            articulo+=articulos[i].toString();
            articulo+="\n";
        }
        return articulo.toString();
    }
}
