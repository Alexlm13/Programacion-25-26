package Ejercicio2;

import Ejercicio2.Articulo;
import java.util.*;

public class GestSimAlm {
    private AlmArticulo almacen;

    public GestSimAlm() {
        almacen = new AlmArticulo();
    }

    public void entradaAutomatizada() {
        Articulo a1 = new Articulo("A01", "Ratón");
        Articulo a2 = new Articulo("A02", "Teclado");
        Articulo a3 = new Articulo("A03", "Monitor");
        Articulo a4 = new Articulo("A04", "Torre");

        almacen.almacena(a1);
        almacen.almacena(a2);
        almacen.almacena(a3);
        almacen.almacena(a4);

        System.out.println("Artículos cargados correctamente");
    }

    public void lista() {
        for (Articulo a : almacen.getArticulos()) {
            System.out.println(a);
        }
    }

    private boolean codigoExiste(String codigo) {
        for (Articulo a : almacen.getArticulos()) {
            if (a.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }

    public void alta() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca descripción del articulo: ");
        String descripcion = entrada.nextLine();

        System.out.print("\nIntroduzca su código: ");
        String codigo = entrada.nextLine();

        while (codigoExiste(codigo)){
            System.out.println("\nEl código de este articulo ya existe, introduzca otro distinto: ");
            codigo = entrada.nextLine();
        }

        System.out.print("\nPrecio de compra: ");
        int precioCompra = entrada.nextInt();
        entrada.nextLine();

        System.out.print("\nPrecio de venta: ");
        int precioVenta = entrada.nextInt();
        entrada.nextLine();

        System.out.print("\nStock inicial: ");
        int stock = entrada.nextInt();
        entrada.nextLine();

        // 2. Crear objeto Articulo
        Articulo a = new Articulo(codigo, descripcion);

        // 3. Ajustar otros valores
        a.setPrecioCompra(precioCompra);
        a.setPrecioVenta(precioVenta);
        a.setStock(stock); // recuerda que stock no es static

        // 4. Guardar en almacén
        almacen.almacena(a);

        System.out.println("\nArtículo añadido correctamente.");
    }

    public void baja(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el código del artículo que quieras dar de baja: ");
        String codigo=entrada.nextLine();

        if (!codigoExiste(codigo)) {
            System.out.println("El código no existe, escriba uno de nuevo: ");
            codigo=entrada.nextLine();
        }

        for (Articulo a : almacen.getArticulos()) {
            if (codigo==a.getCodigo()) {
                a.getCodigo().equals(codigo);
                totalArticulos--;
            }
        }


        System.out.println("Artículo dado de baja");
    }
}
