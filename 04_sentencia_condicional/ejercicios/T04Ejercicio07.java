/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio07 {
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

    sc.close();
 } 
}
