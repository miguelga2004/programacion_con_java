/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numVolt = 0;
    int num = 0;
    int cantDigi = 0;
    
    do {
      System.out.print("Introduce un numero entero positivo: ");
      num = sc.nextInt();
    } while (num < 0);

    int copiaNum = num;
    
    while (copiaNum>0) {
      numVolt = ((numVolt * 10) + (copiaNum%10));
      copiaNum /= 10;
    }

    int copNumVolt = numVolt;

    while (copNumVolt>0) {
      copNumVolt /= 10;
      cantDigi ++;
    }


    System.out.print("El numero " + num + " en decimal es el ");
    
    for (int i = 0; i < cantDigi; i++) {
      int digi = (numVolt%10);
      for (int j = 0; j < digi; j++) {
        System.out.print("| ");
      }
      if (i < cantDigi - 1) {
        System.out.print("- ");
      }
      numVolt/=10;
    }
    System.out.print(" en el sistema de palotes");
  }
}