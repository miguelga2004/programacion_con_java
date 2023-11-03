/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int horas;
    int resultado;

    System.out.print("Introduce la cantidad de horas trabajas: ");
    horas = sc.nextInt();

    resultado = horas*12;

    System.out.println("El salario semanal es = " + resultado);
    
    sc .close();
  }
}
