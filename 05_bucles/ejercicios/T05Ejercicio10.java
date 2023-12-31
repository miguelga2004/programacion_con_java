/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. A priori, el programa no sabe cuántos números se
  introducirán. El usuario indicará que ha terminado de introducir los datos
  cuando meta un número negativo.
 * @author Miguel Garcia
 */ 
import java.util.Scanner;
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numIntroducido = 0;
    double media = 0;
    double suma = 0;

    while (numIntroducido >= 0) {
      System.out.println("Introduce numero");
      numIntroducido = sc.nextDouble();
      if (numIntroducido>=0) {
        suma = suma + numIntroducido;
        media ++;
      }
    }
    double resultado = suma/media;

    System.out.println("El resultado es " + resultado);
    sc.close();
  }
}
