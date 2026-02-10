package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio5;

public class Mi_bicicleta {
    //ATRIBUTOS
    String color = "Negro";
    double velocidad = 0;
    int marcha = 2;

    //CONSTRUCTOR
    public Mi_bicicleta() {
        this.color = color;
        this.velocidad = velocidad;
        this.marcha = marcha;
    }

    //METODOS
    public void Avanzar() {
        velocidad += 5;
        System.out.println("La bicicleta avanza, la velocidad es: " + velocidad + "km/h");
        ;
    }

    public void Frenar() {
        if (velocidad > 0) {
            velocidad -= 5;
        }
        ;
        System.out.println("La bicicleta frena la velocidad, ahora va a: " + velocidad + "km/h");
    }

    public void CambiarMarcha(int nuevaMarcha) {
        marcha = nuevaMarcha;
        System.out.println("La marcha ha cambiado a: " + marcha);
    }

    //GETTERS
    public String getColor() {
        return color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }
}
