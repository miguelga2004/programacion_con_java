/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T04Ejercicio11 {
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Introduce la hora: ");
  int hora = sc.nextInt();

  System.out.print("Introduce los minutos: ");
  int minutos = sc.nextInt();

  int tDia = 1440;

  int tRestante = ((tDia - ((hora * 60) + minutos))*60);

  System.out.println("Faltan " + tRestante + " segundos");

  sc.close();
}  
}
