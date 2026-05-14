package Ejercicio2;

public class Articulo {
    //ATRIBUTOS
    private String codigo, descripcion;
    

    private double precioCompra, precioVenta;
    private int stock;
    
    //METODO CONSTRUCTOR
    public Articulo(String codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }
    
    //GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    //TOSTRING
    @Override
    public String toString() {
        return "Articulo: "+descripcion+" Código: "+codigo;
    }
}
