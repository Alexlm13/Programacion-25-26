package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio6;

public class Fraccion {
    // ATRIBUTOS
    int numerador;
    int denominador;

    //GETTERS
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    // METODOS
    public void Invierte() {
        int invertir;

        invertir = denominador;
        denominador = numerador;
        numerador = invertir;
    }

    public void setFraccion(int den, int num) {
        numerador = num;
        denominador = den;
    }

    static Fraccion Multiplica(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion();

        f3.setFraccion(f1.getDenominador()*f2.getDenominador(),
                       f2.getNumerador()*f2.getNumerador());

        return f3;
    }

    static Fraccion Divide(Fraccion f1, Fraccion f2) {
        Fraccion f3 = new Fraccion();

        f3.setFraccion(f1.getDenominador()*f2.getNumerador(),
                       f2.getNumerador()*f2.getDenominador());

        return f3;
    }

    //FUNCION MCD
    int MCD(int n1, int n2){
        int dividendo;
        int divisor;
        int resto;

        dividendo=Math.max(n1, n2);
        divisor=Math.min(n1, n2);

        if (dividendo%divisor==0) {
            return divisor;
        }else{
            while (divisor!=0) {
                resto=dividendo%divisor;
                dividendo=divisor;
                divisor=resto;
            }
            return (dividendo);
        }
    }

    public void Simplifica(){
        int mcd= this.MCD(this.getNumerador(), this.getDenominador());
        this.setFraccion(this.getNumerador()/mcd, this.getDenominador()/mcd);
    }
}
