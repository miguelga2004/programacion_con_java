/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int respuesta;
    for (int i = 0; i < 5;) {
      System.out.print("Introduce la contraseña: ");
      respuesta = sc.nextInt();
      if (respuesta==4444) {
        System.out.println("*****La caja fuerte se ha abierto satisfactoriamente.*****");
        i = i + 5;
      } else {

        System.out.println("*****Lo siento, esa no es la combinación*****");
        i = i + 1;
      }
    }
    

    sc.close();
  }
}
