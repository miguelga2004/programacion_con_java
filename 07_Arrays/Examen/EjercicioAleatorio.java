import java.util.Scanner;

public class EjercicioAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 100) + 1; // Genera un número del 1 al 100
        int numeroIntentos = 0;
        int intentoUsuario;
        boolean haAdivinado = false;

        System.out.println("¡Bienvenido al Juego de Adivinar Números!");
        System.out.println("He pensado un número entre 1 y 100. ¿Puedes adivinarlo?");

        while (!haAdivinado) {
            System.out.print("Introduce tu adivinanza: ");
            intentoUsuario = sc.nextInt();
            numeroIntentos++;

            if (intentoUsuario < numeroAleatorio) {
                System.out.println("Muy bajo, intenta con un número mayor.");
            } else if (intentoUsuario > numeroAleatorio) {
                System.out.println("Muy alto, intenta con un número menor.");
            } else {
                haAdivinado = true;
                System.out.println("¡Correcto! ¡Has adivinado el número en " + numeroIntentos + " intentos!");
            }
        }

        sc.close();
    }
}
