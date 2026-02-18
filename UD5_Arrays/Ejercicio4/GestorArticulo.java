package UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio4;

import UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio2.Articulo;
import UD5_POO_ClasesYObjetos.UD5_Arrays.Ejercicio3.PruebaArticulo;

public class GestorArticulo {
    private Articulo articulos[];
    private int contador;

    public GestorArticulo(int tamaño) {
        articulos = new Articulo[tamaño];
        contador = 0;
    }

    public void entradaAutomatizada() {

        articulos[contador++] = new Articulo("C001", "Ratón Logitech");
        articulos[contador++] = new Articulo("C002", "Monitor LG");
        articulos[contador++] = new Articulo("C003", "Portátil HP");
        articulos[contador++] = new Articulo("C004", "Auriculares HyperX");

        System.out.println("Se han creado 4 artículos.");
    }

    public void lista() {
        for (int i = 0; i < contador; i++) {
            System.out.println(articulos[i]);
        }
    }

    public boolean alta(Articulo a) {
        if (contador < articulos.length) {
            articulos[contador++] = a;
            return true;
        } else {
            System.out.println("No hay espacio para más artículos");
            return false;
        }
    }

    public boolean baja(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {
                for (int j = i; j < contador - 1; j++) {
                    articulos[j] = articulos[j + 1];
                }
                contador--;
                articulos[contador] = null;
                return true;
            }
        }
        System.out.println("El artículo introducido no existe");
        return false;
    }

    public String entradaMercancia(String codigo, int cant) {
        for (int i = 0; i < contador; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {
                articulos[i].setStock(articulos[i].getStock() + cant);
                return "El stock del producto ha sido actualizado";
            }
        }
        return "Artículo no encontrado";
    }

    public String salidaMercancia(String codigo, int cant) {
        for (int i = 0; i < contador; i++) {
            if (articulos[i].getCodigo().equals(codigo)) {

                // 👇 AÑADE ESTO PARA DEPURAR
                System.out.println("Stock actual: " + articulos[i].getStock());
                System.out.println("Cantidad solicitada: " + cant);

                if (cant > articulos[i].getStock()) {
                    return "No hay suficiente stock";
                } else {
                    articulos[i].setStock(articulos[i].getStock() - cant);
                    return "El stock del producto ha sido actualizado";
                }

            }

        }
        return "Artículo no encontrado";
    }
}