/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la L: ");
    int altura = sc.nextInt();

    for (int i = 0; i < (altura-1); i++) {
      System.out.println("*");
    }
    for (int i = 0; i < (1+(altura/2)); i++) {
      System.out.print("* ");
    }
    sc.close();
  }
}