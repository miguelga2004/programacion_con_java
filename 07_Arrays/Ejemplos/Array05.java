/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class Array05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] notas = new double[3];
    double media;
    double suma = 0;

    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      notas[i] = sc.nextDouble();
    }

    // int ejemplo = sc.nextInt();

    System.out.println("Tus notas son: ");
    // for (int i = 0; i < notas.length; i++) {
    //   System.out.print(notas[i] + ", ");
    // }
    

    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }

    System.out.println("");

    media = ((notas[0] + notas[1] + notas[2])/notas.length);
    suma = (notas[0] + notas[1] + notas[2]);
    System.out.println("La nota media es " + media);

    System.out.println("La suma de las notas es " + suma);
    
    sc.close();    
  }
}
