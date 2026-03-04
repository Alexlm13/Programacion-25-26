package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio7;

public class Partido {
    //ATRIBUTOS
    private Jugador jugador1, jugador2;
    private int setJugador1, setJugador2;
    private boolean resultadoRegistrado;

    //METODO CONSTRUCTOR
    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    //METODOS
    public void regisResul(int sets1, int sets2){
        if (resultadoRegistrado) {
            System.out.println("El resultado ya fue registrado.");
            return;
        }
        if (sets1==sets2) {
            System.out.println("Resultado no válido en tenis.");
            return;
        }

        this.setJugador1=sets1;
        this.setJugador2=sets2;

        jugador1.actualizarSets(sets1, sets2);
        jugador2.actualizarSets(sets2, sets1);

        resultadoRegistrado=true;
    }


    public String descripcion(){
        String info="===== PARTIDO =====\n";

        info+="\n--- Jugador1 ---\n";
        info+=jugador1.toString();

        info+="\n--- Jugador2 ---\n";
        info+=jugador2.toString();

        if (resultadoRegistrado) {
            info+="\nResultado: "+setJugador1+" - "+setJugador2;
        }else{
            info+="\n Resultado: Pendiente";
        }

        return info;
    }
    
    //GETTERS SETTERS
    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public int getSetJugador1() {
        return setJugador1;
    }

    public int getSetJugador2() {
        return setJugador2;
    }

    public boolean isResultadoRegistrado() {
        return resultadoRegistrado;
    }
}