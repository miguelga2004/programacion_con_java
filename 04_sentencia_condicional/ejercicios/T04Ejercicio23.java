/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
 import java.util.Scanner;
 public class T04Ejercicio23 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduce el precio base del producto: ");
  float precio = sc.nextFloat();

  sc.nextLine();
  
  System.out.print("Introduce el tipo de IVA (general, reducido o superreducido.): ");
  String IVA = sc.nextLine();

  System.out.print("Introduce el tipo de descuento (nopro, mitad, meno5 o 5por.): ");
  String descuento = sc.nextLine();

  float totalIVA=0;
  float totalPromocion=0;

  switch (IVA) {
    case "general":
      totalIVA = (precio * 0.21f);
      break;

    case "reducido":
      totalIVA = (precio * 0.10f);
      break;

    case "superreducido":
      totalIVA = (precio * 0.04f);
      break;
  
    default:
      System.out.println("El IVA introducido no existe. ");
      break;
  }

  switch (descuento) {
    case "nopro":
      totalPromocion = 0;
      break;

    case "mitad":
      totalPromocion = ((precio+totalIVA) / 2);
      break;

    case "meno5":
      totalPromocion = ((precio+totalIVA) - 5);
      break;

    case "5por":
      totalPromocion = ((precio+totalIVA) * 0.05f);
      break;
  
    default:
      System.out.println("El IVA introducido no existe. ");
      break;
  }
  
  System.out.printf("%-20s %8.2f\n", "Base imponible =", precio);
  System.out.printf("%-20s %8.2f\n", "IVA", totalIVA);
  System.out.printf("%-20s %8.2f\n", "Precio con IVA", (precio+totalIVA));
  System.out.printf("%-20s %8.2f\n", "Cod promo", (-1*(totalPromocion)));
  System.out.printf("%-20s %8.2f\n", "TOTAL", ((precio+totalIVA)-totalPromocion));


  sc.close();    
  }
}
