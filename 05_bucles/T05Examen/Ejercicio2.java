/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jugada = 0;
    int error = 0;
    int respuesta1 = 0;
    int respuesta2 = 0;
    
    System.out.print("Introduce el primer nombre: ");
    String nombre1 = sc.nextLine();
    int numeroLetras1= nombre1.length();

    System.out.println("Introduce el segundo nombre");
    String nombre2 = sc.nextLine();
    int numeroLetras2= nombre2.length();

    int numeroLetras = Math.max(numeroLetras1, numeroLetras2);

      System.out.println("Jugador 1 introduce tu jugada: ");
      String jugada1 = sc.nextLine();

      if (jugada1.equals("piedra")) {
        respuesta1 = 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else if (jugada1.equals("papel")) {
        respuesta1 = 2;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else if (jugada1.equals("tijera")) {
        respuesta1 = 3;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else {
        error += 1;
      }
      
      System.out.println("Jugador 2 introduce tu jugada: ");
      String jugada2 = sc.nextLine();

      if (jugada2.equals("piedra")) {
        respuesta2 = 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else if (jugada2.equals("papel")) {
        respuesta2 = 2;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else if (jugada2.equals("tijera")) {
        respuesta2 = 3;
        System.out.print("\033[H\033[2J");
        System.out.flush();
      } else {
        error += 1;
      }
      

      

    sc.close();
  }
}
