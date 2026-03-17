package UD7_Colecciones.Ejercicio1;
/*(ArrayList) Crea una clase Menu, que dispondrá de un atributo arrayList de String. Tendrá un método
creaOpcion que permitirá crear las distintas opciones del menú, otro método muestraMenu que
mostrará todas las opciones del menú, y un método capturaOpcion que devolverá la opción
seleccionada por el usuario. Prueba dicha clase en otra clase denominada TestMenu. La clase Menu
la utilizaremos en el resto de ejercicios que deban usan un menú de opciones */

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner entrada=new Scanner(System.in);
    private ArrayList<String> lista=new ArrayList<>();

    public void creaOpcion(String texto){
        lista.add(texto);
    }

    public void muestraMenu(){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i+1)+". "+lista.get(i));
        }
    }

    public int capturaOpcion(){
        int opc=entrada.nextInt();
        return opc;
    }
}