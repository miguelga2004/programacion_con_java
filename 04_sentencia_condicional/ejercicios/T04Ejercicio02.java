/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T04Ejercicio02 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  float hora;
  
  System.out.println("¿Que hora es?");
  hora = sc.nextFloat();

  if ((hora>=6)&&(hora<=12)) {
    System.out.println("Buenos dias");
  } else if ((hora>=13)&&(hora<=20)) {
    System.out.println("Buenas tardes");
  }else{
    System.out.println("Buenas noches");
  }

  sc.close();
  }
 
}
