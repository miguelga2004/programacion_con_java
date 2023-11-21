/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
 import java.util.Scanner;
 public class T04Ejercicio25 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduzca la altura de la bandera en cm: ");
  float alt = sc.nextFloat();

  System.out.print("Introduzca la anchura de la bandera en cm: ");
  float anch = sc.nextFloat();

  System.out.print("¿Quiere escudo bordado?(si/no): ");
  String esc = sc.next();

  

  System.out.println("Gracias, aqui tiene el desglose de su compra: ");

  float area = alt*anch;
  float precArea = (area * 0.01f);
  float precEscudo = 0;
  float gastosEnvio = 3.25f;
  

  if (esc.equals("si")) {
    precEscudo = 2.5f;
  }

  System.out.printf("%-16s %2.0f cm2: %5.2f€\n", "Bandera de ", area, precArea);

  if (esc.equals("si")) {
    System.out.printf("%-16s  %13.2f€\n", "Con escudo:", precEscudo);
  } else {
    System.out.printf("%-16s  %13.2f€\n", "Sin escudo:", precEscudo);
  }
  System.out.printf("%-16s  %13.2f€\n", "Gastos de envio:", gastosEnvio);
  System.out.printf("%-16s  %13.2f€\n", "Total:", (precArea+precEscudo+gastosEnvio));

  sc.close();    
  }
}
