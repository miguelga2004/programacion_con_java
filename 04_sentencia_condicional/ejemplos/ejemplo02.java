/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.print("Introduce un numero entre el 1 y el 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("El numero es correcto");
    } else {
      System.out.println("El numero es incorrecto");
    }
  sc.close();
  }
}
