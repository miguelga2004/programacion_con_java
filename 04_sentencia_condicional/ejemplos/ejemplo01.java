/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */


import java.util.Scanner;

public class ejemplo01 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int nota;

  System.out.println("¿Que nota has sacado en el examen?");
  nota = sc.nextInt();


  if (nota >= 5) {
    System.out.println("Felicidades estas aprovado");

  } else {
    System.out.println("No estas aprovado");
  }
  sc.close();
}
}