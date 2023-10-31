/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    int num1;
    int num2;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el primer numero: ");
    num1 = sc.nextInt();

    System.out.printf("Introduce el segundi numero: ");
    num2 = sc.nextInt();

    System.out.println("El resultado de multiplicar " + num1 + " x " + num2 + " es " + num1*num2);
  }
  }