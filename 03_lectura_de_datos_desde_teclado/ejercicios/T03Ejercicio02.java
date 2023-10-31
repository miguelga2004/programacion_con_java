/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
  int euros;
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduce la cantidad de euros que quieres pasar a pesetas: ");
  euros = sc.nextInt();

  System.out.println("El resultado de convertir " + euros + " a pesetas es " + euros*166.384);

  sc .close();
  }
}
