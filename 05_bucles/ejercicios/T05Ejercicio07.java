/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int respuesta;
    int i;
    for (i = 0; i < 5;) {
      System.out.print("Introduce la contraseña: ");
      respuesta = sc.nextInt();
      
      if (respuesta==4444) {
        System.out.println("-----COMBINACION CORRECTA-----");
        i = i + 6;
      } else {
        System.out.println("-----COMBINACION INCORRECTA-----");
        i = i + 1;
      }
    }

    System.out.println("");

    if (i==5) {
      System.out.println("-----LA CAJA HA SIDO BLOQUEADA-----");
      System.out.println("");
    } else{
      System.out.println("€€€€€€€€");
      System.out.println(""); 
    }
  }
}
