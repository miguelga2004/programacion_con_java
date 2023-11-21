/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduza un numero y le dire cuantos digitos tiene: ");
    long num = sc.nextLong();
    int cantCifras = 1;
    long n = num;
    sc.close();

    while (n > 10) {
      n /= 10;
      cantCifras++;
    }
    System.out.println("El numero tiene " + cantCifras + " de cifras.");
  }
}
