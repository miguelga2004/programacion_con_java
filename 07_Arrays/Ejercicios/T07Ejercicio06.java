/**
 * T07Ejercicio05
 */
import java.util.Scanner;
public class T07Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numero = new int[5];

    System.out.println("Introduce los numeros enteros y pulse intro");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = sc.nextInt();  
    }

    for (int i = 0; i < numero.length; i++) {
      System.out.printf("%3d", numero[i]);  
    }

    System.out.println("");

    for (int i : numero) {
      System.out.printf("%3d", i);
    }

    System.out.println("");
    
    int aux = numero[numero.length-1];

    for (int i = numero.length-1; i > 0; i--) {
      numero[i] = numero[i-1];
    }
    numero[0] = aux;

    for (int i : numero) {
      System.out.printf("%3d", i);
    }

    sc.close();
  }
}