/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio22_2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Que dia es?: ");
    String dia = sc.nextLine();

    System.out.print("¿Introduce la hora?: ");
    int hora = sc.nextInt();

    System.out.print("¿Introduce los minutos?: ");
    int minutos = sc.nextInt();

    sc.close();

    int MINUTOSTOTALES = 0;

    int diasTranscurridos = 0;
    switch (dia) {
      case "lunes", "martes", "miercoles", "jueves", "viernes":
        
        MINUTOSTOTALES = (((4 * 24) + 15 ) * 60);

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

        break;

      case "sabado", "domingo":

        MINUTOSTOTALES = (((6 * 24) + 15 ) * 60);

        switch (dia) {
          case "sabado":
            diasTranscurridos = 1;
            break;

          case "domingo":
            diasTranscurridos = 2;
            break;
        
          default:
            System.out.println("No has introducido un valor correcto");
        break;
    
    }
    }
    int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (hora * 60) + minutos;  

    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al fin de sem");
  }  
}
