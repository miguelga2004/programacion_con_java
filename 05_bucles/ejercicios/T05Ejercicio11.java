/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
  
    System.out.print("Introduce numero: ");
    numIntroducido = sc.nextInt();

    double cuadrado = Math.pow(numIntroducido, 2);
    double cubo = Math.pow(numIntroducido, 3);

    for (int i = 1; i <= 5; i++) {
      System.out.printf("%4.0f %6.0f %6.0f\n", numIntroducido, cuadrado, cubo );
      numIntroducido ++;

      cuadrado = Math.pow(numIntroducido, 2);
      cubo = Math.pow(numIntroducido, 3);
    }
    
    sc.close();
  }
}
