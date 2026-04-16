package Ejercicio10;

import java.util.*;

public class TestVehiculo {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        Coche c1 = new Coche();
        Scanner entrada = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println(
                    "VEHÍCULOS\n" +
                            "=========\n" +
                            "1. Anda con la bicicleta\n" +
                            "2. Haz el caballito con la bicicleta\n" +
                            "3. Arrancar el coche\n" +
                            "4. Detener el coche\n" +
                            "5. Comprobar si está arrancado el coche\n" +
                            "6. Anda con el coche\n" +
                            "7. Quema rueda\n" +
                            "8. Ver kilometraje de la bicicleta\n" +
                            "9. Ver kilometraje del coche\n" +
                            "10. Ver kilometraje total\n" +
                            "11. Salir\n" +
                            "Elige una opción(1-11)");
            opc = entrada.nextInt();
            entrada.nextLine();// limpiar buffer
            switch (opc) {
                case 1:
                    b1.andar();
                    break;
                case 2:
                    b1.caballito();
                    break;
                case 3:
                    c1.arrancar();
                    break;
                case 4:
                    c1.detener();
                    break;
                case 5:
                    c1.estaArrancado();
                    break;
                case 6:
                    c1.andar();
                    break;
                case 7:
                    c1.quemarRueda();
                    break;
                case 8:
                    System.out.println("La bici ha recorrido: " + b1.getKmRecorridos() + "km");
                    break;
                case 9:
                    System.out.println("El coche ha recorrido: " + c1.getKmRecorridos() + "km");
                    break;
                case 10:
                    System.out.println("Kilometros totales recorridos: " + Vehiculo.getKmTotales());
                    break;
                case 11:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta, elija de nuevo (1-11)");
                    break;
            }
        } while (opc != 11);
    }
}
