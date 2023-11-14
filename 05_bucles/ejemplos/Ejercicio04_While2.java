/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
  public class Ejercicio04_While2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0;
    int cuentaNumeros = 0;
    int suma = 0;

    System.out.println("Por favor, introduce números enteros positivos");
    System.out.println("El programa finalizara cuando introduzca un número negativo.");

    while (numeroIntroducido >= 0) {
      System.out.print("Numero: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        cuentaNumeros++;
        suma += numeroIntroducido;
      }
    }

    sc.close();
    System.out.println("La cantidad de numeros positivos introducidos es " + cuentaNumeros);
    System.out.println("La suma de los numero introducidos es " + suma);
    }
  }
