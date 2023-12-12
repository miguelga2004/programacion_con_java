/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la U: ");
    int altura = sc.nextInt();
    int base = altura - 2;
    

    for (int i = 0; i < (altura-1); i++) {
      System.out.print("*");
      for (int j = 0; j < base; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    
    System.out.print(" ");
    for (int j = 0; j < base; j++) {
      System.out.print("*");
      }
    System.out.println(" ");

    sc.close();
  }
}