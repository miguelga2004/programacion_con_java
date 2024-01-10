/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

public class Array01 {
  public static void main(String[] args) {
    int[] n;
    n = new int[4];

    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;

    System.out.println(n[0] + " " + n[1] + " " + n[2]);

    int suma = n[1] + n[3];
    System.out.println("El resultado es " + suma);
  }
}
