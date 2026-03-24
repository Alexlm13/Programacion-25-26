package Ejercicio5;

public class Restaurante {
    public static void main(String[] args) {
        // CREAR PEDIDO TIPO PIZZA
        Pedido pedido1=new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Pepperoni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();

        // CREAR PEDIDO TIPO HAMBURGUESA
        Pedido pedido2=new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();

        // CREAR PEDIDO TIPO ENSALADA
        Pedido pedido3=new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();

        // CREAR PEDIDO TIPO PASTA
        Pedido pedido4=new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();

        System.out.println("Número total de pedidos realizados: "+Pedido.getNumPedido());
    }
}
