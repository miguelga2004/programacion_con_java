/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
  int pesetas;
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduce la cantidad de pesetas que quieres pasar a euros: ");
  pesetas = sc.nextInt();

  System.out.printf("El resultado de convertir pesetas a euros es %.0f%n", pesetas/166.384);

  sc .close();
  }
}
