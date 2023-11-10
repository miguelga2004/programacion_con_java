/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;

public class T04Ejercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolución de una ecuación de segundo grado (ax^2 + bx + c = 0)");
        System.out.println("Ingresa el valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Ingresa el valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Ingresa el valor de c: ");
        double c = scanner.nextDouble();

        // Calculamos el discriminante
        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raíces son reales y diferentes:");
            System.out.println("Raíz 1 = " + raiz1);
            System.out.println("Raíz 2 = " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuación tiene una raíz real y doble:");
            System.out.println("Raíz = " + raiz);
        } else {
            System.out.println("Las raíces son números complejos.");
        }

        // Cierra el escáner
        scanner.close();
    }
}
