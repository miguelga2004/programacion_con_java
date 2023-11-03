/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int megabite;
    int resultado;
   

    System.out.print("Introduce la cantidad de Megabits: ");
    megabite = sc.nextInt();

    resultado = megabite*1024;

    System.out.println("El resultado de pasar " + megabite + "Mb a Kb es = " + resultado + "Kb");
    
    sc .close();
  }
}
