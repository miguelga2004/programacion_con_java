/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float radio;
    float altura;
    float resultado;

    System.out.print("Introduce el radio: ");
    radio = sc.nextFloat();

    System.out.print("Introduce la altura: ");
    altura = sc.nextFloat();

    resultado = ((1.0f/3)*3.1416f*(radio*radio)*altura);
    
    System.out.println("El volumen de un cono es = " + resultado);

    sc .close();
  }
}