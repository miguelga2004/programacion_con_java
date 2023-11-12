/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int temp = 0;

    System.out.print(" Introduce el numero 1: ");
    int num1 = sc.nextInt();

    System.out.print(" Introduce el numero 2: ");
    int num2 = sc.nextInt();

    System.out.print(" Introduce el numero 3: ");
    int num3 = sc.nextInt();
    sc.close();

    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    if (num2 > num3) {
      temp = num2;
      num2 = num3;
      num3 = temp;
    }

    if (num1 > num2) {
      temp = num1;
      num1 = num2;
      num2 = temp;
    }

    System.out.println(num1 + " " + num2 + " " + num3);


  }
}
