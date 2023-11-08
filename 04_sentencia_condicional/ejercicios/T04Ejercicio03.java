/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el dia (num) de la semana: ");
    int dia = sc.nextInt();

    switch (dia) {
      case 1:
        System.err.println("Es lunes");
        break;
  
      case 2:
        System.err.println("Es martes");
        break;
  
      case 3:
        System.err.println("Es miercoles");
        break;
  
      case 4:
        System.err.println("Es jueves");
        break;
  
      case 5:
        System.err.println("Es viernes");
        break;

      case 6:
        System.err.println("Es sabado");
        break;
  
     
      default:
        System.out.println("Es domingo");
        break;
     }
    sc.close();
  }
}
