/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la primera nota: ");
    double nota1 = sc.nextDouble();

    System.out.print("Introduce la segunda nota: ");
    double nota2 = sc.nextDouble();

    System.out.print("Introduce la ercera nota: ");
    double nota3 = sc.nextDouble();
    
    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);

    if (media < 5) {
      System.out.println("Insuficiente");
    } else if (media < 6) {
      System.out.println("Suficiente");
    } else if (media < 7) {
      System.out.println("Bien");
    } else if (media < 9) {
      System.out.println("Notable");
    } else {
      System.out.println("Sobresaliente");
    }
    
    sc.close();
 } 
}