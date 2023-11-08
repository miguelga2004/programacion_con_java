/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
 import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce el nombre del artículo a vender: ");
    String articulo = sc.nextLine();

    System.out.print("Introduce el precio base del articulo (sin IVA): ");
    float precioBase = sc.nextFloat();

    System.out.print("Introduce la cantidad de articulos que se desean: ");
    int cant = sc.nextInt();

    float calcSubtotal = (float)(precioBase*cant);
    float calcDescuento = (float)(calcSubtotal*0.15);
    float calcSubtotalDesc = (float)(calcSubtotal-calcDescuento);
    float calcIVA = (float)(calcSubtotalDesc*0.21);
    float total = (float)(calcSubtotalDesc+calcIVA);

    System.out.println("Factura");
    System.out.println("=================================");
    System.out.printf("%-8s %24s\n", "Artículo", articulo);
    System.out.printf("%-8s %23.2f€\n", "Précio", precioBase);
    System.out.printf("%-8s %24d\n", "Cantidad", cant);
    System.out.printf("%-8s %23.2f€\n", "Subtotal", calcSubtotal );
    System.out.printf("%-8s -%15.2f€\n", "Descuento (15%)", calcDescuento );
    System.out.printf("%-8s %9.2f€\n", "Subtotal con descuento", calcSubtotalDesc);
    System.out.printf("%-8s %22.2f€\n", "IVA (21%)", calcIVA);
    System.out.println("");
    System.out.println("=================================");
    System.out.printf("\033[48;5;8m%-8s %24.2f\033[0m\n", "Précio", total);
  
    sc.close(); 
  }
}
