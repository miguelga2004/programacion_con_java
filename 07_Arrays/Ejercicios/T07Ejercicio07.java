/**
 * T07Ejercicio05
 */

import java.util.Scanner;

public class T07Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int[] temperatura = new int[12];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Introduce la temperatura media de " + mes[i] + ": ");
            temperatura[i] = sc.nextInt(); 
        }

        System.out.println("\nHistograma de Temperaturas:");
        for (int i = 0; i < mes.length; i++) {
            System.out.printf("%-12s |", mes[i]); // Alineación a la izquierda para los nombres de los meses
            for (int j = 0; j < temperatura[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        sc.close();
    }
}
