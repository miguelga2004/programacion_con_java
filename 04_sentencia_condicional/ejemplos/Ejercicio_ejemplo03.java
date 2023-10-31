/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class Ejercicio_ejemplo03 {
  public static void main(String[] args) {
    int eleccion;
    int base;
    int altura;

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce *1 Cuadrado *2 Rectangulo *3 Triangulo");
    eleccion = sc.nextInt();

    switch (eleccion) {
      case 1, 2:
        System.out.print("Introduce la base: ");
        base = sc.nextInt();

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("El area es " + base*altura);

        break;

      default:
        System.out.print("Introduce la base: ");
        base = sc.nextInt();

        System.out.print("Introduce la altura: ");
        altura = sc.nextInt();

        System.out.println("El area de el triangulo es " + (base*altura)/2);
        break;
    }
  }
  
}
