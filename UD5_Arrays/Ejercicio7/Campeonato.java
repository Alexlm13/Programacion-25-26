package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio7;

public class Campeonato {
    // Atributos
    private Jugador jugadores[];
    private Partido partidos[];
    private int numJugadores, numPartidos;

    // Metodo constructor
    public Campeonato(int maxJugadores, int maxPartidos) {
        jugadores = new Jugador[maxJugadores];
        partidos = new Partido[maxPartidos];
        numJugadores = 0;
        numPartidos = 0;
    }

    // Metodos
    public boolean inscribirJug(Jugador j) {
        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i] == j) {
                System.out.println("No se puede inscribir a un mismo jugador 2 veces");
                return false;
            }
        }

        if (numJugadores < jugadores.length) {
            jugadores[numJugadores] = j;
            numJugadores++;
            System.out.println("El jugador ha sido inscrito");
            return true;
        }

        System.out.println("No se puede inscribir mas jugadores");
        return false;
    }

    public boolean agregarPart(Partido p) {
        boolean encontrado1 = false;
        boolean encontrado2 = false;

        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == p.getJugador1()) {
                encontrado1 = true;
            }
            if (jugadores[i] == p.getJugador2()) {
                encontrado2 = true;
            }
        }

        if (encontrado1 == true && encontrado2 == true) {
            System.out.println("Partido agregado correctamente");
            partidos[numPartidos] = p;
            numPartidos++;
            return true;
        }

        System.out.println("Uno de los participantes no está registrado, el partido no se puede agregar");
        return false;
    }

    public void registrarResul(int idx, int s1, int s2) {
        if (idx < 0 || idx >= numPartidos) {
            System.out.println("El partido no existe.");
            return;
        }

        partidos[idx].regisResul(s1, s2);
    }

    public Jugador[] obtenerClasif() {

        Jugador copia[] = new Jugador[numJugadores];

        for (int i = 0; i < numJugadores; i++) {
            copia[i] = jugadores[i];
        }

        for (int i = 0; i < numJugadores - 1; i++) {
            for (int j = 0; j < numJugadores - 1; j++) {
                if (copia[j].getVictorias() < copia[j + 1].getVictorias()) {
                    Jugador temp = copia[j];
                    copia[j] = copia[j + 1];
                    copia[j + 1] = temp;
                }
            }
        }
        return copia;
    }

    public void mostrarClasif() {
        Jugador[] clasif = obtenerClasif(); // obtenemos la clasificación ordenada
        System.out.println("CLASIFICACIÓN DEL CAMPEONATO:");
        for (int i = 0; i < numJugadores; i++) {
            System.out.println((i + 1) + ". " + clasif[i].getNombre() + " - Victorias: " + clasif[i].getVictorias());
        }
    }
}
