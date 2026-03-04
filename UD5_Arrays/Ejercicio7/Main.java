package UD5_POO_ClasesYObjetos.Relacion10_Arrays.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        // 1. Crear campeonato
        Campeonato camp = new Campeonato(10,20);

        // 2. Crear jugadores
        Jugador j1 = new Jugador("Alex",20,5);
        Jugador j2 = new Jugador("Marcos",22,3);
        Jugador j3 = new Jugador("Lucía",17,7);

        // 3. Inscribir jugadores
        camp.inscribirJug(j1);
        camp.inscribirJug(j2);
        camp.inscribirJug(j3);

        // 4. Crear partidos
        Partido p1 = new Partido(j1, j2);
        Partido p2 = new Partido(j1, j3);
        Partido p3 = new Partido(j2, j3);
        Partido p4 = new Partido(j1, j3);

        // 5. Agregar partidos al campeonato
        camp.agregarPart(p1);
        camp.agregarPart(p2);
        camp.agregarPart(p3);
        camp.agregarPart(p4);

        // 6. Registrar resultados

        // Ejemplo: Alex gana 2–0 a Marcos
        camp.registrarResul(0, 2, 0);

        // Ejemplo: Lucía gana 2–1 a Alex
        camp.registrarResul(1, 1, 2);

        // Ejemplo: Marcos gana 2–0 a Lucía
        camp.registrarResul(2, 2, 0);

        //Ejemplo Alex gana 2-0 a Lucía
        camp.registrarResul(3, 2, 0);

        // 7. Mostrar clasificación final
        camp.mostrarClasif();
    }
}
