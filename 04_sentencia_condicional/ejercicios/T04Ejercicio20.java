/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio20 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    boolean capicua = false;
    System.out.print("Introduce un numero (Maximo 5 cifras): ");
    int respuesta = sc.nextInt();
    int n = Math.abs(respuesta);

    if (n < 10) {
      System.out.println("Es capicuo");

    } else if ((n >= 10) && (n < 100)) {

      if ((n/10)==(n%10)) {
        capicua = true;
      }

    } else if ((n >= 100) && (n < 1000)) {

      if ((n/100)==(n%10)) {
        capicua = true;
      }

    } else if ((n >= 1000) && (n < 10000)) {
      
      if (((n / 1000))==((n % 10))&&(((n / 100) % 10)==((n % 100) / 10))) {
        capicua = true;
      }

    } else if ((n >= 10000) && (n < 100000)) {
      
      if (((n / 10000))==((n % 10))&&(((n / 1000) % 10)==((n / 10) % 10))) {
        capicua = true;
      }

    } else {
      System.out.println("El numero tiene mas de 5 cifras");
    }

    if (capicua) {
      System.out.println("El numero es capicuo");
    } else {
      System.out.println("No es capicuo");
    }

    sc.close();
  }
}
