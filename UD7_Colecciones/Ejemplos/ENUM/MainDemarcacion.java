package UD7_Colecciones.Ejemplos.ENUM;

public class MainDemarcacion {
    public static void main(String[] args) {
        Demarcacion delantero=Demarcacion.DELANTERO;
        Demarcacion defensa=Demarcacion.DEFENSA;

        System.out.println(delantero.name());
        System.out.println(delantero.toString());
        System.out.println(delantero.ordinal());
        System.out.println(delantero.compareTo(delantero));//compara la posicion antes del punto con la del parentesis
        System.out.println(Demarcacion.values()[0]);
        System.out.println(Demarcacion.valueOf("DEFENSA"));

        for (Demarcacion d : Demarcacion.values()) {
            System.out.print(d.toString()+" ");
        }
        System.out.println("");
        if (delantero.equals(defensa)) {
            System.out.println("No es delantero");
        }else{
            System.out.println("Es delantero");
        }
    }
}
