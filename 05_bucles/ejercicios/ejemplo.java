import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduzca números entre 0 y 9 y pulsa ENTER. Introduce un número negativo si desea parar.");

        // Leer los números y imprimir el histograma de inmediato
        while(true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                // salir del bucle si el número es negativo
                break;
            } else if (numero >= 0 && numero <= 9) {
                // Imprimir la línea del histograma correspondiente al número
                System.out.print(numero + " | ");
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println(); // nueva línea después de cada número
            } else {
                System.out.println("Número no válido. Por favor, introduzca un número entre 0 y 9.");
            }
        }

        scanner.close();
    }
}
