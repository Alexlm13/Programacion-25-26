package UD7_Colecciones.Ejemplos.HashSet;

import java.util.HashSet;

public class Ejermplo2 {
    public static void main(String[] args) {

	  // Try working with another hash set of String type
	  HashSet rainbow = new HashSet();

        // Adding elements into HashSet using add()
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Indigo");
        rainbow.add("Violet");


        // Let's traverse the hashset
        System.out.println("Traversing the rainbow:");
        for (Object i : rainbow){
             System.out.println(i);
        }
       // Check out if rainbow contains this color or not
    	 System.out.println("\n-------Using Contains Method-------");

        System.out.println("rainbow.contains(\"Yellow\"): \t" + rainbow.contains("Yellow"));
        System.out.println("rainbow.contains(\"White\"): \t"  + rainbow.contains("White"));
        System.out.println("rainbow.contains(\"Lavender\"): \t"  + rainbow.contains("Lavender"));
        System.out.println("rainbow.contains(\"Red\"): \t"  + rainbow.contains("Red"));

        // Remove a color from rainbow using remove()
        rainbow.remove("Red");

        // Now consume  set contains() method again to check if it's still present
        System.out.println("rainbow.contains(\"Red\"): \t"  + rainbow.contains("Red"));

        System.out.println("\nAfter removing Red: " + rainbow);
	}
}
