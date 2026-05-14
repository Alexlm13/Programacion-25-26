package Ejercicio7;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        HashMap<String, Double> supermercado = new HashMap<>();
        HashMap<String, Integer> cesta=new HashMap<>(); // Creo otro HashMap para agrupar productos y cantidades
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String producto = "", codigoDescuento="";
        int cantidad;
        double total = 0, descuentoAplicado=0, totalDescuento=0;
        
        supermercado.put("Avena", 2.21);
        supermercado.put("Garbanzos", 2.39);
        supermercado.put("Tomate", 1.59);
        supermercado.put("Jengibre", 3.13);
        supermercado.put("Quinoa", 4.50);
        supermercado.put("Guisantes", 1.60);

        while (!producto.equalsIgnoreCase("fin")) {
            System.out.print("Producto: ");
            producto = entrada.nextLine();

            if (producto.equalsIgnoreCase("fin")) {
                break;
            }
            if (!supermercado.containsKey(producto)) {
                System.out.println("No hay existencias de dicho producto");
                continue;
            }

            System.out.print("Cantidad: ");
            cantidad = entrada.nextInt();
            entrada.nextLine();

            //SI LA CESTA CONTIENE YA UN PRODUCTO 
            // SUMA ESA CANTIDAD CON LA CANTIDAD NUEVA INTRODUCIDA
            
            if (cesta.containsKey(producto)) {
                cesta.put(producto, cesta.get(producto)+cantidad);
            }else{
                cesta.put(producto, cantidad);
            }
        }

        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        codigoDescuento=entrada.nextLine();

        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");

        for (String prod : cesta.keySet()) {
            double precio=supermercado.get(prod);
            int cant=cesta.get(prod);
            double subtotal=precio*cant;
            total+=subtotal;

            System.out.printf("%-8s %.2f %3d %12.2f\n", prod, precio, cant, subtotal);
        }

        for (Descuento d : Descuento.values()) {
            if (d.name().equalsIgnoreCase(codigoDescuento)) {
                descuentoAplicado=total*d.getPorcentaje();
                break;
            }
        }

        if (descuentoAplicado==0 && !codigoDescuento.equalsIgnoreCase("INTRO")) {
            System.out.println("Código no válido. No se aplicará descuento.");
        }
        totalDescuento=total-descuentoAplicado;
        System.out.println("---------------------------------");
        System.out.printf("Descuento: %.2f\n", descuentoAplicado);
        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f",totalDescuento);
    }
}