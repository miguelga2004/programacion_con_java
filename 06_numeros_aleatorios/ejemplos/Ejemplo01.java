/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

public class Ejemplo01 {
  public static void main(String[] args) {
    double numero;
    int numeroEntero;
    int numeroRango;
    int numeroRangoAlto;

    for (int i = 0; i < 10; i++) {
      numero = (Math.random()*10);
      System.out.printf("%.2f\n", numero);
    }

    for (int i = 0; i < 10; i++) {
      numeroEntero = (int)(Math.random()*10);
      System.out.println(numeroEntero);
    }

    for (int i = 0; i < 10; i++) {
      numeroEntero = (int)((Math.random()*100)+1);
      System.out.println(numeroEntero);
    }

    for (int i = 0; i < 10; i++) {
      numeroRangoAlto = (int)((Math.random()*21) + 5);
      System.out.println(numeroRangoAlto);
    }

  }
}