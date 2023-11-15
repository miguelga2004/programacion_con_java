/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el numero que quieres saber: ");
    int num = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
      System.out.println(num + " X " + i + " = " + (i*num));
    }
    
    sc.close();
  }
}
