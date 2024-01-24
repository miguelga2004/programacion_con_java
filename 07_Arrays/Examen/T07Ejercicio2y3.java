/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T07Ejercicio2y3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num[] = new int[20];
    int aux;

    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*20)+1;
      System.out.print(num[i] + " ");
    }
    System.out.println("");

    System.out.println("Introduce la primera posicion");
    int pos1 = sc.nextInt();

    System.out.println("Introduce la segunda posicion");
    int pos2 = sc.nextInt();

    aux = num[pos1-1];
    num[pos1-1] = num[pos2-1];
    num[pos2-1] = aux;

    for (int i = 0; i < num.length; i++) {
      if (i==pos1-1||i==pos2-1) {
        System.out.print("\"" + num[i] + "\" ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
    sc.close();
}
}

