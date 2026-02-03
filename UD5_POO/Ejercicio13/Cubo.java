package Ejercicio13;

public class Cubo {

    //ATRIBUTOS
    private double capacidad, contenido;

    //CONSTRUCTOR
    public Cubo(double capacidad, double contenido) {
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    //METODOS
    public String llenar(double litros){
        String r="";
        
        if (contenido+litros>capacidad) {
            r="La cantidad no puede ser mayor que la capacidad del cubo, se desborda el agua";
            
        }else{
            contenido+=litros;
            r="El cubo se llenó "+litros+"L, su cantidad es de: "+contenido+"L";
        }

        return r;
    }

    public String vaciar(double litros){
        String r="";

        if (contenido-litros<0) {
            r="La cantidad de litros no puede quedarse negativa";
        }else{
            contenido-=litros;
            r="El cubo se vació "+litros+"L, su cantidad es de: "+contenido+"L";
        }

        return r;
    }

    public void vertir(Cubo c, double litros){
        if (this.contenido>=litros && c.contenido+litros<=c.capacidad) {
            this.contenido-=litros;
            c.contenido+=litros;
            System.out.printf("Se han vertido %.1f litros.\nOrigen: %.1f litros.\nDestino: %.1f litros.",litros,this.contenido,c.contenido);
        } else {
            System.out.println("No se puede verter, litros insuficientes o cubo de destino lleno");
        }
    }

    //GETTERs
    public double getCapacidad() {
        return capacidad;
    }

    public double getContenido() {
        return contenido;
    }
}
