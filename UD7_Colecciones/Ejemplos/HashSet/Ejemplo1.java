package UD7_Colecciones.Ejemplos.HashSet;

import java.util.HashSet;

public class Ejemplo1 {
    public static void main(String[] args) {

       // Declare your hash set
       HashSet digits = new HashSet();

       digits.add(4);
       digits.add(2);
       digits.add(3);
       digits.add(1);
       digits.add(5);
       digits.add(0);
       digits.add(null);
       System.out.println("All elements in hashset:\t" + digits);

       // Try adding duplicates
       digits.add(5);
       digits.add(2);
       System.out.println("After adding duplicates: \t" + digits);

       System.out.println("\n-------Using Contains Method-------");
       // Check out if the following digits exist in the hashset
       System.out.println("digits.contains(0) : " + digits.contains(0));
       System.out.println("digits.contains(2) : " + digits.contains(2));
       System.out.println("digits.contains(3) : " + digits.contains(7));
       System.out.println("digits.contains(null) : " + digits.contains(null));
   }
}
