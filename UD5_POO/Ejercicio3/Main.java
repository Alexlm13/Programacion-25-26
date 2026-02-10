package UD5_POO_ClasesYObjetos.Relacion9_Clases.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Ave ave=new Ave();
        Gato gato=new Gato();
        Mamifero mamifero=new Mamifero();
        Perro perro=new Perro();

        animal.setPatas(true);
        animal.setEspecie("Ave");
        animal.setCantPatas(2);

        ave.setAltura(2.10);
        ave.setColor("Negro");
        ave.setNombre("Avestruz");

        gato.setPelaje(true);
        gato.setColor("Gris");
        gato.setRaza("British");

        mamifero.setEspecie("Marítima");
        mamifero.setPatas(0);
        mamifero.setPelaje(false);

        perro.setColor("Canela");
        perro.setRaza("Perro de agua");
        perro.setTipoPelo("Rizado");

        System.out.printf("Animal: %s\nAve: %s\nAltura: %.2f\n", animal.getEspecie(), ave.getNombre(), ave.getAltura());
        System.out.printf("\nMamifero\nEspecie: %s\nPatas: %d\nPelaje: %b\n", mamifero.getEspecie(), mamifero.getPatas(), mamifero.isPelaje());
        System.out.printf("\nGato\nPelaje: %b\nColor: %s\nRaza: %s\n", gato.isPelaje(), gato.getColor(), gato.getRaza());
        System.out.printf("\nPerro\nColor: %s\nRaza: %s\nTipo de pelo: %s",perro.getColor(), perro.getRaza(), perro.getTipoPelo());
    }
}
