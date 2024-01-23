/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T07Ejercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] temperatura = new int[12];

    System.out.println("Introduce la temperatura media de cada mes");
    for (int i = 1; i < 13; i++) {
      System.out.print(i + ": ");
      temperatura[i] = sc.nextInt();
    }
    

    sc.close();
  }
}
