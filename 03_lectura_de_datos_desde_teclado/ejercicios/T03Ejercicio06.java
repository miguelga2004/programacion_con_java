/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float base;
    float altura;

    System.out.print("Introduce la base: ");
    base = sc.nextFloat();
    System.out.print("Introduce la altura: ");
    altura = sc.nextFloat();

    System.out.println("El area del triangulo es: " + (base*altura)/2);

    sc .close();
  }
}
