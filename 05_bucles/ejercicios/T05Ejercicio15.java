/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    System.out.print("Introduce numero: ");
    double base = sc.nextDouble();

    System.out.print("Introduce numero: ");
    double exponente = sc.nextDouble();

    double potencia = Math.pow(base, exponente);

    System.out.printf("El resultado de la potencia es : %.0f", potencia);
        
    sc.close();
  }
}