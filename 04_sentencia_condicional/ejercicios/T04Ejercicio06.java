/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T04Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura desde donde cae tu objeto: ");
    double h = sc.nextDouble();
    double g = 9.81;
    double t = Math.sqrt(2*h/g);
    
    System.out.printf("El objeto tarda %.2f segundos en caer.\n", t);

    sc.close();
  }
}
