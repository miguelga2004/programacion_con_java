/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio19 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un numero (Maximo 5 cifras): ");
    int respuesta = sc.nextInt();
    int numero = Math.abs(respuesta);
    int digitios = 0;

    if (numero < 10) {
      digitios = 1;
    } else if ((numero >= 10) && (numero < 100)) {
      digitios = 2;
    } else if ((numero >= 100) && (numero < 1000)) {
      digitios = 3;
    } else if ((numero >= 1000) && (numero < 10000)) {
      digitios = 4;
    } else if ((numero >= 10000) && (numero < 100000)) {
      digitios = 5;
    } else {
      System.out.println("El numero tiene mas de 5 cifras");
    }

    System.out.println("El numero de digitos es: " + digitios);

    sc.close();
  }
}
