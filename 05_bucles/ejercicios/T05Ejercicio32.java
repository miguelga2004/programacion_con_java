/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;
public class T05Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        long num = sc.nextLong();

        long sumaPares = 0;
        String digitosPares = "";
        boolean hayDigitosPares = false;

        while (num > 0) {
            long digito = num % 10;
            if (digito % 2 == 0) {
                sumaPares += digito;
                digitosPares = digito + " " + digitosPares;
                hayDigitosPares = true;
            }
            num /= 10;
        }

        if (hayDigitosPares) {
            System.out.println("Dígitos pares: " + digitosPares);
            System.out.println("Suma de los dígitos pares: " + sumaPares);
        } else {
            System.out.println("No hay dígitos pares en el número.");
        }
    }
}
