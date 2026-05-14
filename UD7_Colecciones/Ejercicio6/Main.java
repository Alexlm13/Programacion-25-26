package Ejercicio6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> supermercado = new HashMap<>();
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        String producto = "";
        int cantidad;
        double total = 0;

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

            productos.add(producto);
            cantidades.add(cantidad);

        }

        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");

        for (int i = 0; i < productos.size(); i++) {
            String prod = productos.get(i);
            int cant = cantidades.get(i);
            double precio = supermercado.get(prod);

            double subtotal = precio * cant;
            total += subtotal;

            System.out.printf("%-8s %.2f %3d %11.2f\n", prod, precio, cant, subtotal);
        }

        System.out.println("---------------------------------");
        System.out.printf("TOTAL: %.2f",total);
    }
}