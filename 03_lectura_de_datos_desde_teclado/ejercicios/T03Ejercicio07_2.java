/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio07_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double baseImponible;
    
    System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
    baseImponible = sc.nextDouble();

    System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
    System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));   //Para imprimir el carácter %, lo debemos escapar utilizando %%
    System.out.printf("-------------------------\n");
    System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));

    sc.close();
  }
}
