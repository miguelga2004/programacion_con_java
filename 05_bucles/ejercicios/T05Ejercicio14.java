/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
    int positivo = 0;
    int negativo = 0;

    for (int i = 0; i < 11; i++) {
      System.out.print("Introduce un numero: ");
      numIntroducido = sc.nextInt();
      if (numIntroducido>=0) {
        positivo ++;
      } else {
        negativo ++;
      }
    }

    System.out.println("Hay " + positivo + " numeros positivos y " + negativo + " numeros negativos.");
  
  }
}
