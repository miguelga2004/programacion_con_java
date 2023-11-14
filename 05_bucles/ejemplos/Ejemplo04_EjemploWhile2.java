/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
  public class Ejemplo04_EjemploWhile2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int i = 0;
    int num;
    String respuesta;

    while (true) {
      System.out.println("Introduce un numero: ");
      num = sc.nextInt();
      i++;

      sc.nextLine();

      System.out.println("Quieres introducir otro numero? (si/no)");

        respuesta = sc.nextLine();
          if (respuesta.equals("si")) {
          } else {
            break;
          }
    }
    sc.close();
  }
}