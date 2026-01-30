package Ejercicio10;

public class Incidencia {
    private int puesto, numIncidencia;
    private String fallo, estado, falloResuelto;
    static int pendientes, contInci;

    public Incidencia(int puesto, String fallo) {
        this.puesto = puesto;
        this.fallo = fallo;
        pendientes++;
        estado="Pendiente";
        contInci++;
        numIncidencia=contInci;
    }

    public void resuelve(String r){
        falloResuelto=r;
        estado="Resuelto";
        pendientes--;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        if (estado.equals("Resuelto")) {
            return "Incidencia "+numIncidencia+" - "+"Puesto: "+puesto+" - "+fallo+" - "+estado+" - "+falloResuelto;
        }else{
            return "Incidencia "+numIncidencia+" - "+"Puesto: "+puesto+" - "+fallo+" - "+estado;
        }
    }
}
