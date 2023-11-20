/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Ejercicio_ejemplo01 {
  public static void main(String[] args) {
    int edad;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce tu edad: ");
    edad = sc.nextInt();

    if ((edad >= 1) && (edad <= 17)) {
      System.out.println("Es menor de edad");
    } else {
      if ((edad >= 18) && (edad <= 64)) {
        System.out.println("Es mayor de edad");
      } else {
        System.out.println("Es jubilado");
      }
    }
    sc.close(); 
  }
}
