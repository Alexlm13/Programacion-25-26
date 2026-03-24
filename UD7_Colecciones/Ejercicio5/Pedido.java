package Ejercicio5;

import java.util.*;

public class Pedido {
    //ATRIBUTOS
    private static int numPedido;
    private TipoComida comida;
    private HashSet<String> ingredientes;

    //METODO CONSTRUCTOR
    public Pedido(TipoComida comida){
        this.comida=comida;
        ingredientes=new HashSet<>();
        numPedido++;
    }

    //METODO AGREGAR INGREDIENTES
    public void agregarIngrediente(String ingrediente){
        ingredientes.add(ingrediente);
    }

    //METODO MOSTRAR PEDIDO
    public void mostrarPedido(){
        if (ingredientes.size()==0) {
            System.out.println("PEDIDO: "+comida.name()+"\nID del pedido: "+numPedido+"\nIngredientes extra: Ninguno");
        }else{
            System.out.println("PEDIDO: "+comida.name()+"\nID del pedido: "+numPedido+"\nIngredientes extra: "+ingredientes);
        }
    }

    //GETTERS
    public static int getNumPedido() {
        return numPedido;
    }
}