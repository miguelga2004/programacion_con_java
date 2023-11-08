/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor de a: ");
    int a = sc.nextInt();

    System.out.print("Introduce el valor de b: ");
    double b = sc.nextDouble();
    
    if ((a == 0) && (b != 0)) {
      System.out.println("Esa ecuación no tiene solución real.");

    } else {
      System.out.println("x = " + (-b/a));
    }

    sc.close();
  }
}
