package Ejercicio7;

public class Pizza {
    //ATRIBUTOS
    String sabor, tamaño, estado;
    static int servidas=0;
    static int pedidas=0;

    //METODO CONSTRUCTOR
    public Pizza(String sabor, String tamaño) {
        this.sabor = sabor;
        this.tamaño = tamaño;
        this.estado="pedida";
        this.pedidas++;
    }

    //METODOS
    void sirve(){
        if (this.estado.equals("servida")) {
            System.out.println("esa pizza ya se ha servido");
        }else{
            this.estado="servida";
            this.servidas++;
        }
    }

    static int getTotalPedidas(){
        return pedidas;
    }

    static int getTotalServidas(){
        return servidas;
    }

    @Override
    public String toString() {
        return "Pizza "+this.sabor+" "+this.tamaño+", "+this.estado;
    }

}
