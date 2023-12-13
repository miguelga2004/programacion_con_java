/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = 0;
    
    System.out.print("Introduce un numero entero positivo: ");
    int num = sc.nextInt();
    
    for (int i = 1; i <= num; i++) {
      int factorial = 1;
      for (int j = 1; j <= i; j++) {
        factorial *= j;
      }
      System.out.println( i + " = " + factorial);
    }
  }
}