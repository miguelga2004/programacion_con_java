/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cantidad;
    int resultado;

    System.out.print("Introduce la cantidad de euros que quieras calcular la base imponible: ");
    cantidad = sc.nextInt();

    resultado = (cantidad + ((cantidad*21)/100)) - ((cantidad*15)/100);

    System.out.println("El calculo de la base imponible es: ");
    System.out.println("" + cantidad + " + 21% de IVA - 15% de IRPF = ");
    System.out.println("" + cantidad + " + " + ((cantidad*21)/100) + " euros - " + ((cantidad*15)/100) + " euros = ");
    System.out.println("El resultado es = " + resultado);
    
    sc .close();
  }
}
