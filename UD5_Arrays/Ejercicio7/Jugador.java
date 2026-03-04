package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio7;

public class Jugador {
    // atributos
    private String nombre;
    private int edad, ranking, victorias, derrotas, setsGanados, setsPerdidos;
    static int numJugadores;

    // METODOS
    public Jugador(String nombre, int edad, int ranking) {
        this.nombre = nombre;
        this.edad = edad;
        this.ranking = ranking;

        this.victorias = 0;
        this.derrotas = 0;
        this.setsGanados = 0;
        this.setsPerdidos = 0;

        numJugadores++;
    }

    public void actualizarSets(int setG, int setP) {
        this.setsGanados += setG;
        this.setsPerdidos += setP;

        if (setG > setP) {
            victorias++;
        } else {
            derrotas++;
        }
    }

    public int diferenciaSets(){
        return setsGanados-setsPerdidos;
    }

    // GETTERS SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getSetsGanados() {
        return setsGanados;
    }

    public int getSetsPerdidos() {
        return setsPerdidos;
    }

    public static int getNumJugadores() {
        return numJugadores;
    }

    public static void setNumJugadores(int numJugadores) {
        Jugador.numJugadores = numJugadores;
    }

    // toString
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nRanking: " + ranking + "\nVictorias: " + victorias
                + "\nDerrotas: " + derrotas +
                "\nSets ganados: " + setsGanados +
                "\nSets perdidos: " + setsPerdidos;
    }
}
