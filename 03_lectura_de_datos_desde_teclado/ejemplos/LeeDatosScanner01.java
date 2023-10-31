import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");   
    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();                  

    System.out.print("Introduce tu edad: ");      
    int edad = sc.nextInt();                      

    System.out.println("Tu nombre es " + nombre +" y tienes " + edad + " años");
    sc.close();
  }
  
}