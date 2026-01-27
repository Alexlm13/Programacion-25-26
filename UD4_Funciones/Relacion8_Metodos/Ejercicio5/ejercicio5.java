package Relacion8_Metodos.Ejercicio5;

public class ejercicio5 {
    public static int[] concatena(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            r[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            r[a.length+i]=b[i];
        }

        return r;
    }

    public static void main(String[] args) {
        int a[]={2,3,4};
        int b[]={4,5,2};
        int r[]=concatena(a, b);

        System.out.print("Array concatenado: {");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i]);
            if (i < r.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }
}
