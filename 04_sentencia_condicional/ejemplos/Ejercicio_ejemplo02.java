/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;


public class Ejercicio_ejemplo02 {
  public static void main(String[] args) {
    int mes;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el numero del mes: ");
    mes = sc.nextInt();

    switch (mes) {
      case 1:
        System.out.print("El mes es Enero");
        break;

      case 2:
        System.out.print("El mes es Febrero");
        break;

      case 3:
        System.out.print("El mes es Marzo");
        break;

      case 4:
        System.out.print("El mes es Abril");
        break;

      case 5:
        System.out.print("El mes es Mayo");
        break;

      case 6:
        System.out.print("El mes es Junio");
        break;

      case 7:
        System.out.print("El mes es Julio");
        break;

      case 8:
        System.out.print("El mes es Agosto");
        break;

      case 9:
        System.out.print("El mes es Septiembre");
        break;

      case 10:
        System.out.print("El mes es Octubre");
        break;

      case 11:
        System.out.print("El mes es Noviembre");
        break;

      case 12:
        System.out.print("El mes es Diciembre");
        break;
        
    
      default:
        break;
    }
  }
}
