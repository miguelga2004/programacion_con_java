/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;
import matematicas.Varias;

public class potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce número para la base: ");
        int base = sc.nextInt();

        System.out.print("Introduce número para el exponente: ");
        int exponente = sc.nextInt();

        long potencia = Varias.potencia(base, exponente);  // Llama al método potencia

        System.out.printf("El resultado de la potencia es : %d", potencia);

        sc.close();
    }
}
