package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio2;

public class Articulo {
    private int stock;
    private String descripcion, codigo;
    private double precioCompra, precioVenta;

    //CONSTRUCTOR
    public Articulo(String codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }

    //GETTERs / SETTERs
    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    //toString
    @Override
    public String toString() {
        return "Código: "+codigo+"\nDescripción: "+descripcion;
    }
}
