/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
    int a = 0;
    int b = 1;
  
    System.out.print("Introduce cuantos numeros deseas conocer: ");
    numIntroducido = sc.nextInt();

    for (int i = 0; i < numIntroducido; i++) {
    int c = a + b;
    a = b;
    b = c;
      System.err.print(a + " ");
    }
    
    sc.close();
  }
}
