package Ejercicio11;

public class Rectangulo {
    private int base, altura;
    static int cont;

    //CONSTRUCTOR
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        cont++;
    }

    //METODOS
    private String dibujo(){
        String r="";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                r+="*";
            }

            r+="\n";
        }

        return r;
    }
    
    //GETTERs
    public static int getRectangulosCreados() {
        return cont;
    }

    @Override
    public String toString() {
        return dibujo();
    }

}
