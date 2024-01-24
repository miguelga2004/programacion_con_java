import java.util.Scanner;

public class ExamenOtraClase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dado = new int[6];
        System.out.println("TRES O MAS");
        int puntuacion1 = 0;
        int puntuacion2 = 0;
        int maxRepeticionesJ1, maxRepeticionesJ2;
        int numeroMasRepetidoJ1, numeroMasRepetidoJ2;

        for (int i = 1; i < 11; i++) {
            maxRepeticionesJ1 = 0;
            numeroMasRepetidoJ1 = 0;
            maxRepeticionesJ2 = 0;
            numeroMasRepetidoJ2 = 0;

            // Tirada para el jugador 1
            System.out.print("Tirada " + i + " del jugador 1: ");
            int[] repeticionesJ1 = new int[6];
            for (int j = 0; j < dado.length; j++) {
                dado[j] = (int) (Math.random() * 6) + 1;
                System.out.print(dado[j] + "-");
                repeticionesJ1[dado[j] - 1]++;
            }

            // Procesar puntuación jugador 1
            for (int l = 0; l < repeticionesJ1.length; l++) {
                if (repeticionesJ1[l] > maxRepeticionesJ1) {
                    maxRepeticionesJ1 = repeticionesJ1[l];
                    numeroMasRepetidoJ1 = l + 1;
                }
            }

            // Calcular puntos jugador 1
            if (maxRepeticionesJ1 == 3) {
                puntuacion1 += 3;
            } else if (maxRepeticionesJ1 == 4) {
                puntuacion1 += 6;
            } else if (maxRepeticionesJ1 == 5) {
                puntuacion1 += 12;
            }

            System.out.println("; " + puntuacion1 + " puntos");

            // Tirada para el jugador 2
            System.out.print("Tirada " + i + " del jugador 2: ");
            int[] repeticionesJ2 = new int[6];
            for (int j = 0; j < dado.length; j++) {
                dado[j] = (int) (Math.random() * 6) + 1;
                System.out.print(dado[j] + "-");
                repeticionesJ2[dado[j] - 1]++;
            }

            // Procesar puntuación jugador 2
            for (int l = 0; l < repeticionesJ2.length; l++) {
                if (repeticionesJ2[l] > maxRepeticionesJ2) {
                    maxRepeticionesJ2 = repeticionesJ2[l];
                    numeroMasRepetidoJ2 = l + 1;
                }
            }

            // Calcular puntos jugador 2
            if (maxRepeticionesJ2 == 3) {
                puntuacion2 += 3;
            } else if (maxRepeticionesJ2 == 4) {
                puntuacion2 += 6;
            } else if (maxRepeticionesJ2 == 5) {
                puntuacion2 += 12;
            }

            System.out.println("; " + puntuacion2 + " puntos");
            System.out.println("Presiona 'Enter' para la siguiente ronda");
            scanner.nextLine(); // Espera que el usuario presione Enter

            System.out.println();
        }

        scanner.close();
    }
}
