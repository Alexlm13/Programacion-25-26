package Ejercicio9;

public class Tiempo {
    private int hora;
    private int min;
    private int seg;

    // Constructor
    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
        Ajustar(); // Ajusta automáticamente al crear el objeto
    }

    // Método para sumar otro Tiempo
    public Tiempo Suma(Tiempo t) {
        Tiempo resultado = new Tiempo(
            this.hora + t.hora,
            this.min + t.min,
            this.seg + t.seg
        );
        // Ajustar ya se llama en el constructor
        return resultado;
    }

    // Método para restar otro Tiempo
    public Tiempo Resta(Tiempo t) {
        Tiempo resultado = new Tiempo(
            this.hora - t.hora,
            this.min - t.min,
            this.seg - t.seg
        );
        // Ajuste para manejar negativos
        resultado.Ajustar();
        return resultado;
    }

    // Método privado para ajustar el tiempo
    private void Ajustar() {
        // Ajuste de segundos
        if (seg < 0) {
            int prestado = (Math.abs(seg) + 59) / 60;
            min -= prestado;
            seg += prestado * 60;
        }
        min += seg / 60;
        seg = seg % 60;

        // Ajuste de minutos
        if (min < 0) {
            int prestado = (Math.abs(min) + 59) / 60;
            hora -= prestado;
            min += prestado * 60;
        }
        hora += min / 60;
        min = min % 60;

        // Ajuste de horas (0-23)
        if (hora < 0) {
            hora = (hora % 24 + 24) % 24;
        } else {
            hora = hora % 24;
        }
    }

    // Método toString para imprimir
    @Override
    public String toString() {
        return hora + "h " + min + "m " + seg + "s";
    }
}
