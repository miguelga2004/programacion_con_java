/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T04Ejecicio01 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int dia;

   System.out.print("Introduce el dia de la semana: ");
   dia = sc.nextInt();
  
   switch (dia) {
    case 1:
      System.err.println("A primera hay Fol");
      break;

    case 2:
      System.err.println("A primera hay Programacion");
      break;

    case 3:
      System.err.println("A primera hay Entornos de desarrollo");
      break;

    case 4:
      System.err.println("A primera hay Base de datos");
      break;

    case 5:
      System.err.println("A primera hay Programacion");
      break;

   
    default:
      System.out.println("No hay ninguna asignatura porque es fin de semana");
      break;
   }

   sc.close();
  }
}
