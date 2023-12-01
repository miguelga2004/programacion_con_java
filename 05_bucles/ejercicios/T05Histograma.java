import java.util.Scanner;

public class T05Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un carácter por teclado
        System.out.print("Introduce un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Pedir números enteros hasta que se introduzca un número negativo
        System.out.println("Introduce números enteros (termina con un número negativo):");
        
        int numero = scanner.nextInt();
        while (numero >= 0) {
            // Mostrar la tabla con el carácter repetido
            System.out.print(numero + " | ");
            for (int i = 0; i < numero; i++) {
                System.out.print(caracter + " ");
            }
            System.out.println();

            // Pedir el siguiente número
            numero = scanner.nextInt();
        }

        scanner.close();
    }
}
