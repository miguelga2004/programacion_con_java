/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\033[1mCALCULADORA DE TIEMPO\033[0m");
    System.out.println("");
    System.out.println("=====================");
    System.out.println("");

    System.out.print("Introduce la cantidad de días: ");
    int cantDias = sc.nextInt();

    float años = (cantDias/365);
    float meses = ((cantDias%365)/30);
    float dias = ((cantDias%365)%30);
    
    System.out.printf("" + cantDias + " dias son \033[1;41m%.0f años\033[0m, \033[1;48;5;11m%.0f meses\033[0m y \033[1;48;5;41m%.0f dias\033[0m.", años, meses, dias);
    //No se si tenian que ir todos en negrita, no se aprecia bien en la imagen, unicamente el rojo.
    sc.close();
  }
  
}
