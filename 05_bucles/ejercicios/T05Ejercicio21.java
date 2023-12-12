/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Ejercicio21 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num;
    double media = 0;
    int cont = 0;
    double max = 0;

    System.out.println("Introduce los numeros que quieras calcular: ");
    do {
      num = sc.nextDouble();
      if (num>=0) {
        if ((num%2)!=0) {
        media += num;
        cont += 1;
      } else {
        if (num>max) {
          max=num;
        }
      }
      }
    } while (num>=0);
    System.out.println(media/cont);
    System.out.println(max);
    
    
    sc.close();
  }
}
