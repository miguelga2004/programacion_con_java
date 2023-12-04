/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;

public class ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numero1;
    double numero2;
  
    try {
      System.out.print("Introduzca el primer numero: ");
      numero1= sc.nextDouble();
      System.out.print("Introduce el segundo numero");
      numero2= sc.nextDouble();
      sc.close();
      System.out.println("La media es " + (numero1 + numero2) / 2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media.");
      System.out.println("Los datos introducidos no son correctos.");
    } finally {
      System.out.println("Gracias por utilizar este programa,");
    }
  }
}
