/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long num1Volteado = 0;
    long num2Volteado = 0;
    int cantDigi = 0;
    long numPares = 0;
    long numInpares = 0;

    System.out.print("Introduce el primer numero: ");
    long num1 = sc.nextLong();

    System.out.print("Introduce el segundo numero: ");
    long num2 = sc.nextLong();

    while (num1>0&&num2>0) {
      num1Volteado = ((num1%10)+(num1Volteado*10));
      num1=num1/10;
      num2Volteado = ((num2%10)+(num2Volteado*10));
      num2=num2/10;
      cantDigi ++;
    }

    for (int i = 0; i < cantDigi; i++) {
      if ((num1Volteado%10)%2==0) {
        numPares = (numPares * 10) + (num1Volteado % 10);
        num1Volteado /= 10;
      } else {
        numInpares = (numInpares * 10) + (num1Volteado % 10);
        num1Volteado /= 10;
      }

      if ((num2Volteado%10)%2==0) {
        numPares = (numPares * 10) + (num2Volteado % 10);
        num2Volteado /= 10;
      } else {
        numInpares = (numInpares * 10) + (num2Volteado % 10);
        num2Volteado /= 10;
      }
    }

    System.out.println("El numero formateado por los dígitos pares es " + numPares);
    System.out.println("El numero formateado por los dígitos inpares es " + numInpares);
    sc.close();
  }
}