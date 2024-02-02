import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 1;

        do {
            System.out.println("-D-I-V-I-N-A-R-E-M-");
            System.out.println("Divinarem pensará un numero entre los valores que tú decidas");

            System.out.print("Introduce el valor minimo del intervalo: ");
            int minUser = scanner.nextInt();
            System.out.print("Introduce el valor maxim del intervalo: ");
            int maxUser = scanner.nextInt();

            // Generar intervalo aleatorio
            int minGame = (int)(Math.random()*(maxUser-minUser+1)+minUser);
            int maxGame = (int)(Math.random()*(maxUser-minUser+1)+minUser);
            
            if (minGame > maxGame) {
                int temp = minGame;
                minGame = maxGame;
                maxGame = temp;
            }

            System.out.println("Estoy pensando en un número entre " + minGame + " y " + maxGame);

            // Calcular número de intentos
            int intentos = (int) (Math.log(maxGame - minGame + 1) / Math.log(2));
            System.out.println("Tienes " + intentos + " intentos");

            // Número a adivinar
            int numeroPensado = (int)(Math.random()*(maxGame-minGame+1)+minGame);

            // Proceso de adivinanza
            boolean acertado = false;
            for (int i = 0; i < intentos; i++) {
                System.out.print("Escribe el número: ");
                int numeroUsuario = scanner.nextInt();

                if (numeroUsuario == numeroPensado) {
                    System.out.println("Enhorabuena!!!! has acertado.");
                    System.out.println("Efectivamente el número era: " + numeroPensado);
                    acertado = true;
                    break;
                } else if (numeroUsuario < numeroPensado) {
                    System.out.println("Te has quedado corto");
                } else {
                    System.out.println("Te has pasado");
                }
            }

            if (!acertado) {
                System.out.println("Has superado el número de intentos.");
                System.out.println("El número que había pensado era: " + numeroPensado);
            }

            // Opción de continuar o salir
            System.out.println("Elige una opción");
            System.out.println("1. Volver a jugar.");
            System.out.println("2. Salir del juego.");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

        } while (opcion == 1);

    scanner.close();
    }
}
