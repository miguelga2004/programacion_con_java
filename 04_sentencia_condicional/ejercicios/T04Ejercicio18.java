/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio18 {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    System.out.print("Introduce numero positivo: ");
    int numero = sc.nextInt();
    int primera = 0;
    
    if (numero <10) {
      primera = numero;
    }

    if ((numero >= 10) && (numero < 100)) {
      primera = numero/10;
    }

    if ((numero >= 100) && (numero < 1000)) {
      primera = numero/100;
    }

    if ((numero >= 1000) && (numero < 10000)) {
      primera = numero/1000;
    }

    System.out.println("La primera cifra de un numero entero es: " + primera);

    sc.close();

  }
}
