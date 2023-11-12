/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio14 {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  
  System.out.print("Introduce el numero que quieres consultar: ");
  int num = sc.nextInt();
  
  if ((num%2 == 0)) {
    System.out.print("El numero es par y ");
  } else {
    System.out.print("El numero es inpar y ");
  }

  if ((num%5 == 0)) {
    System.out.print("es divisible /5");
  } else {
    System.out.print("no es divisible /5");
  }

  sc.close();    
  }
}
