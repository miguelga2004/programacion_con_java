/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 1;

    System.out.print("Introduce la catidad de numeros que deseas conocer: ");
    int num = sc.nextInt();
    sc.close();

    for (int i = 0; i < num; i++) {
      System.out.print(a + " ");
      int c = a + b;
      a = b;
      b = c;
    }

  }
}
