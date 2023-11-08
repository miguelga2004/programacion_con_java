/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("\033[1mVOLUMEN DE UN TRONCO DE CONO\033[0m");
  System.out.println("=====================");

  System.out.print("Introduzca el radio de la base mayor R(cm): ");
  float baseMayor = sc.nextFloat();

  System.out.print("Introduzca el radio de la base menor r (cm): ");
  float baseMenor = sc.nextFloat();

  System.out.print("Introduzca la altura h (cm): ");
  float altura = sc.nextFloat();

  double pi = Math.PI;

  float volumenToroide = (float)((1/3)*pi*altura*((baseMayor*baseMayor)+(baseMenor*baseMenor)+baseMayor*baseMenor));


  System.out.printf("El volumen del toriode es de " + "\033[31m%.4f cm\u00B3\033[0m.", volumenToroide);
 
  sc.close();  
  }
}
