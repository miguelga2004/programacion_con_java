/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numTotal = 0;
    int mult = 1;
    int div = 10;

    System.out.print("Introduce el primer numero: ");
    double num1 = sc.nextDouble();

    System.out.print("Introduce el segundo numero: ");
    double num2 = sc.nextDouble();

    while (num1 > 0 || num2 > 0) {
      int digito1 = num1 % 10;
      int digito2 = num2 % 10;

      numTotal = numTotal * mult + digito1;
      numTotal = numTotal * mult + digito2;

      num1 /= 10;
      num2 /= 10;
    }

    
    System.out.println(numTotal);

    sc.close();
  }
}