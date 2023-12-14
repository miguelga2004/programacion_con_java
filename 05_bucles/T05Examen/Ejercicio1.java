/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    

    System.out.print("Introduce el nombre del alumno: ");
    String nombre = sc.nextLine();

    int numeroLetras= nombre.length();
      
      
    System.out.print("Introduce la nota del primer trimestre: ");
    int nota1 = sc.nextInt();

    System.out.print("Introduce la nota del segundo trimestre: ");
    int nota2 = sc.nextInt();

    System.out.print("Introduce la nota del tercer trimestre: ");
    int nota3 = sc.nextInt();

     for (int i = 0; i < numeroLetras-2; i++) {
      if (i==0) {
        System.out.print(" -");
      }
      System.out.print("-");
    }

     for (int i = 0; i < 4; i++) {
      System.out.print("--- ");
    }
      
    System.out.print("------");
    System.out.println("");

    for (int i = 0; i < 1; i++) {
        
      System.out.print("| \033[1m" + nombre + " \033[0m|");
       if (nota1>=5) {
        System.out.print(" \033[32m" + nota1 + "\033[0m |");
       } else {
         System.out.print(" \033[31m" + nota1 + "\033[0m |");
       }

      if (nota2>=5) {
         System.out.print(" \033[32m" + nota2 + "\033[0m | ");
      } else {
        System.out.print(" \033[31m" + nota2 + " \033[0m| ");
      }

      if (nota3>=5) {
        System.out.print("\033[32m" + nota3 + "\033[0m | ");
      } else {
        System.out.print("\033[31m" + nota3 + " \033[0m| ");
       }

      if (((nota1+nota2+nota3)/3)>=5) {
        System.out.printf("\033[32m%.2f\033[0m |", (float)(nota1+nota2+nota3)/3);
      } else {
        System.out.printf("\033[31m%.2f\033[0m |", (float)(nota1+nota2+nota3)/3);
      }
      
     }
     System.out.println("");

     for (int i = 0; i < numeroLetras-2; i++) {
      if (i==0) {
        System.out.print(" -");
      }
       System.out.print("-");
     }

    for (int i = 0; i < 4; i++) {
      System.out.print("--- ");
    }

     System.out.print("------");
    System.out.println("");

    System.out.println("Desea repetir el programa? (S/N)");
    String repetir = sc.nextLine();
      
    sc.close();
  }
}
