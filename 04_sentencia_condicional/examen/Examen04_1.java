/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Examen04_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce el primer operando: ");
    double num1 = sc.nextDouble();

    System.out.print("Introduce el codigo de operacion (+, -, *, /, ^, %): ");
    String simbolo = sc.next();

    System.out.print("Introduce el segundo operando: ");
    double num2 = sc.nextDouble();

    double resultado = 0;

    switch (simbolo) {
      case "+":
        resultado = num1 + num2; 
        break;

      case "-":
        resultado = num1 - num2;
        break;

      case "*":
        resultado = num1 * num2;
        break;

      case "/":
        resultado = num1 / num2;
        break;

      case "^":
        Math.pow(num1, num2);
        break;

      case "%":
        resultado = num1 % num2;
        break;
    
    
      default:
        break;
    }

    System.out.printf("%.2f %s %.2f = %.2f", num1, simbolo, num2, resultado);

    sc.close();
  }
}
