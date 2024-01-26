import java.util.Scanner;

public class AdivinanzasNumero2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rangoMinimo, rangoMaximo, numeroAleatorio, intentoUsuario, numeroIntentos = 0;
    
    System.out.println("¡Bienvenido al Juego de Adivinanza con Rango Dinámico!");
    System.out.print("Por favor, introduce el rango mínimo: ");
    rangoMinimo = sc.nextInt();
    System.out.print("Ahora introduce el rango máximo: ");
    rangoMaximo = sc.nextInt();

    // Asegúrate de que el rango máximo es mayor que el mínimo
    if (rangoMaximo <= rangoMinimo) {
        System.out.println("El rango máximo debe ser mayor que el mínimo.");
        return;
    }

    numeroAleatorio = (int) (Math.random() * (rangoMaximo - rangoMinimo + 1)) + rangoMinimo;

    System.out.println("He pensado un número entre " + rangoMinimo + " y " + rangoMaximo + ". ¿Puedes adivinarlo?");

    do {
        System.out.print("Introduce tu adivinanza: ");
        intentoUsuario = sc.nextInt();
        numeroIntentos++;

        if (intentoUsuario < numeroAleatorio) {
            System.out.println("Muy bajo, intenta con un número mayor.");
        } else if (intentoUsuario > numeroAleatorio) {
            System.out.println("Muy alto, intenta con un número menor.");
        } else {
            System.out.println("¡Correcto! ¡Has adivinado el número en " + numeroIntentos + " intentos!");
        }
    } while (intentoUsuario != numeroAleatorio);

    sc.close();

}
}
