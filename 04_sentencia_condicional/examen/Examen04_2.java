/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Examen04_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Declaraciones globales
    int pisoDestino = 0;
    int pisoActual = 0;


    //Bucle para ejecutar el programa hasta que el usuario desee finalizar.
    while (pisoDestino != -1) {
    
    System.out.print("A que piso quieres viajar: ");
    pisoDestino = sc.nextInt();

    System.out.print("Cuantas personas desean viajar (Max 4): ");
    int numPersonas = sc.nextInt();

    System.out.print("Cual es el peso total de las personas (Max 300kg)(si no es indiscrepcion preguntarlo): ");
    int peso = sc.nextInt();


    if (((numPersonas<=4)&&(peso<=300))&&((pisoDestino<=10)&&(pisoDestino>=0))) {
      if (((pisoActual-pisoDestino)>1)||(((pisoActual-pisoDestino)<-1))) {
        if ((pisoActual-pisoDestino)<1) {
          System.out.println("Subiendo...");
          pisoActual = pisoDestino;
       } else {
          System.out.println("Bajando");
          pisoActual = pisoDestino;
       }
      } else {
        System.out.println("La solicitud ha sido rechazada, se necesita un minimo de 2 plantas de diferencia para morver el ascensor.");
      }

    } else {
      if ((numPersonas>=4)&&(peso>=300)) {
        System.out.println("El ascensor no puede moverse por exceso de carga/peso");
      } else if (pisoDestino==-1) {
        System.out.println("Has decidido salir del programa");
      } else {
        System.out.println("El programa no puede bajar mas del piso 0 ni subir mas que el piso 10");
      }
      
    }
    }

    sc.close();
  }
}
