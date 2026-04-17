package UD6_Herencias.Ejercicio2;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1=new Persona();
        Persona p2=new Persona(30, 1.71, "77145131A");

        Ingeniero i=new Ingeniero(25, 1.80, "22222222B");
        IngenieroInformatico ii=new IngenieroInformatico(35, 1.78, "33333333C");

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(i);
        System.out.println(ii);

        p2.comer();
        p1.hablar();
        i.razonar();
        i.trabajarEnGrupo();
        ii.crearPrograma();

    }
}
