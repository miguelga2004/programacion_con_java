/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();

        int sumaDivisores = 1; 
        System.out.print("Los divisores propios de " + numero + " son: ");

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                System.out.print(i + ", ");
            }
        }

        System.out.println("\nSuma de los divisores propios y el 1: " + sumaDivisores);
        if (sumaDivisores == numero) {
            System.out.println("Es un número perfecto.");
        } else {
            System.out.println("\nNo es un número perfecto.");
        }
    }
}
