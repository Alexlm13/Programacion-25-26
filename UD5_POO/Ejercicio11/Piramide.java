package Ejercicio11;

public class Piramide {
    private int altura;
    static int cont;

    //CONSTRUCTOR
    public Piramide(int altura) {
        this.altura = altura;
        cont++;
    }

    public static int getPiramidesCreadas(){
        return cont;
    }

    private String dibujo(){
        String r="";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura-i-1); j++) {
                r+=" ";
            }

            for (int j = 0; j < (2*i+1); j++) {
                r+="*";
            }
            
            r+="\n";
        }
        
        return r;
    }

    @Override
    public String toString() {
        return dibujo();
    }
}
