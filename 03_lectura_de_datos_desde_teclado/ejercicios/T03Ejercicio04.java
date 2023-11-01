/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;

    System.out.print("Introduce el primer numero: ");
    num1 = sc.nextInt();

    System.out.print("Introduce el segundo numero: ");
    num2 = sc.nextInt();

    System.out.println("");
    System.err.println("******************Resultados******************");
    System.out.println("");

    System.err.println("El resultado de sumar " + num1 + " + " + num2 + " es = " + (num1+num2));
    System.err.println("El resultado de restar " + num1 + " - " + num2 + " es = " + (num1-num2));
    System.err.println("El resultado de multiplicar " + num1 + " * " + num2 + " es = " + (num1*num2));
    System.err.println("El resultado de dividir " + num1 + " / " + num2 + " es = " + (float)(num1/num2));
  }
}
