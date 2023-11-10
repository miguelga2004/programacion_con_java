/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio22 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Que dia es?: ");
    String dia = sc.nextLine();

    

    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60);
    int diasTranscurridos = 0;

    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;

      case "martes":
        diasTranscurridos = 1;
        break;

      case "miercoles":
        diasTranscurridos = 2;
        break;

      case "jueves":
        diasTranscurridos = 3;
        break;

      case "viernes":
        diasTranscurridos = 4;
        break;
    
      default:
        System.out.println("No has introducido un valor correcto");
        break;
    }
    System.out.println("¿Introduce la hora?: ");
    int hora = sc.nextInt();
    System.out.println("¿Introduce los minutos?: ");
    int minutos = sc.nextInt();
    sc.close();

    int minutosTranscurridos = (diasTranscurridos * 24 *60) + (hora * 60) + minutos;

    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al fin de semana:");

  }  
}
