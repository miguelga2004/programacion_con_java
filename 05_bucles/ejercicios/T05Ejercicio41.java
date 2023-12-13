/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un numero entero positivo: ");
    int num = sc.nextInt();
    int copiaNum = num;
    int par = 0;
    int impar = 0;

    while (copiaNum>0) {
      if ((copiaNum%2)==0) {
        par ++;
      } else {
        impar ++;
      }
      copiaNum /= 10;
    }
    System.out.println("El numero " + num + " contiene " + par + " digitos pares y " + impar + " digitos impares.");
  }
}