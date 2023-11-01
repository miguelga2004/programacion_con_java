/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float kilobit;
    float resultado;
   

    System.out.print("Introduce la cantidad de Kilobits: ");
    kilobit = sc.nextFloat();

    resultado = kilobit/1024;

    System.out.println("El resultado de pasar " + kilobit + "Mb a Kb es = " + resultado + "Kb");
    
    sc .close();
  }
}
