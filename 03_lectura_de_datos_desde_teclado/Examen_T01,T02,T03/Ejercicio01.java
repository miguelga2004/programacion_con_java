/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  
  System.out.println("\033[1mVIDA ÚTIL SSD\033[0m");
  System.out.println("=====================");

  System.out.print("Introduzca el factor TBW de tu disco duro SSD: ");
  double twb = scanner.nextDouble();
  
  int añosDeseados = 6;
  
  int diasEnUnAño = 365;
  
  double datosPorDia = twb / (añosDeseados * diasEnUnAño);
  
  double gbPorDia = datosPorDia * 1024;
  
  System.out.println("Puedes escribir como máximo " + datosPorDia + " terabytes (TB) de datos por día.");
  System.out.println("Equivalente a " + gbPorDia + " gigabytes (GB) por día.");
  System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es : " + "%.4f"  + " TB  (" + "%.2f" + " GB)",datosPorDia, gbPorDia);
  
  scanner.close();
  }
}
