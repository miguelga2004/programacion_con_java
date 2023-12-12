/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce numero: ");
    int num = sc.nextInt();
    while (num>0) {
      int digito = num%10;
      System.out.print(digito);
      num /= 10;
    }

    sc.close();
  }
}