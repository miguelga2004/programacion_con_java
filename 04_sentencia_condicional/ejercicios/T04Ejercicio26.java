/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
 import java.util.Scanner;
 public class T04Ejercicio26 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduzca el numero de entradas: ");
  int nEntradas = sc.nextInt();

  System.out.print("¿Que dia de la semana es? ");
  String dia = sc.next();

  System.out.print("¿Tienes tarjeta CineCapa? (s/n)");
  String tCine = sc.next();

  int precioTotal = 0; 
  int entradaIndividual = 0;
  double descuento = 0;

    switch (dia) {
      case "lunes", "martes", "vieres", "sabado", "domingo":
        precioTotal = (nEntradas*8);
        break;

      case "miercoles":
        precioTotal = (nEntradas*5);
        break;

      case "jueves":
        entradaIndividual = (nEntradas&2); 
        precioTotal = ((entradaIndividual*8)+(((nEntradas-entradaIndividual)/2)*11));

        break;
    
      default:
        System.out.println("El dia introducido es erroneo.");
        break;
    }

  }
}
