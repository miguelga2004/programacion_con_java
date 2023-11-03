/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {
  float euros;
  Scanner sc = new Scanner(System.in);


  System.out.print("Introduce la cantidad de euros que quieres pasar a pesetas: ");
  euros = sc.nextFloat();

  int pesetas = (int) (euros * 166.384);

  System.out.printf("El resultado de convertir " + "%.0f" + " a pesetas es " + "%d", euros, pesetas);

  sc .close();
  }
}
