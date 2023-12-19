/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

import matematicas.Varias;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducido = 0;
  
    System.out.print("Introduce cuantos numeros deseas conocer: ");
    numIntroducido = sc.nextInt();

    Varias.fibonacci(numIntroducido);

    sc.close();
  }
}
