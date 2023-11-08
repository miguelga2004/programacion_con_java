/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce las horas trabajadas: ");
    int horasTrabajadas = sc.nextInt();

      if ((horasTrabajadas<=40)) {
        System.out.println("Su sueldo es: " + (horasTrabajadas*12));
      } else {
        System.out.println("Su sueldo es: " + ((40*12)+((horasTrabajadas-40)*16)));
      }
    sc.close();
  }  
}
