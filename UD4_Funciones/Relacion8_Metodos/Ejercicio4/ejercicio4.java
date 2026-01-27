package Relacion8_Metodos.Ejercicio4;

public class ejercicio4 {
    public static String convierteArrayEnString(int[] a){
        String r="";

        for (int i = 0; i < a.length; i++) {
            r+=a[i];
        }

        return r;
    }

    public static void main(String[] args) {
        int a[]={3,4,5,2,5};
        System.out.print(convierteArrayEnString(a));
    }
}
