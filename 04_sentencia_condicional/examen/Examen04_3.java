/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class Examen04_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el tipo de producto:");
    System.out.println("1. Alimentacion");
    System.out.println("2. Farmacia");
    System.out.println("3. Electronica");
    System.out.println("4. Moda");

    System.out.print("¿Que opcion eliges?: ");
    int opcion = sc.nextInt();
    int opcionAliment;
    double iva = 0;
    double descuento = 0;


    switch (opcion) {
      case 1:
        System.out.println("Introduzcal el tipo de alimento");
        System.out.println("1. Huevos");
        System.out.println("2. Pan");
        System.out.println("3. Leche");
        System.out.println("4. Fruta");
        System.out.println("5. Carne");
        System.out.println("6. Agua");
        System.out.println("7. Verduras");
        System.out.println("8. Otros");
        System.out.print("¿Que opcion eliges?: ");
        opcionAliment = sc.nextInt();
        
        switch (opcionAliment) {
          case 1, 2, 3, 4, 7:
              iva = 0.04;
            break;
        
          default:
            iva = 0.10;
            break;
        }
        
        break;

      case 2:
          iva = 0.10;
        break;

      case 3:
          iva = 0.21;
        break;

      case 4:
          iva = 0.21;
        break;
    
      default:
        System.out.println("Has elegido una opcion inexistente.");
        break;
    }

    System.out.print("Introduzca el nombre del producto: ");
    String nombre = sc.next();

    System.out.print("Introduzca la cantidad de productos: ");
    int cant = sc.nextInt();

    System.out.print("Introduzca el precio por unidad del producto: ");
    double precUnidad = sc.nextDouble();

    System.out.print("Introduzca el codigo promocional (SINIVA, PROMO50, PROMO3X2 O NO)");
    String promo = sc.next();

    double totalSinIva = cant * precUnidad;
    double ivaResultante = (totalSinIva*iva);
    double totalConIva = totalSinIva + ivaResultante;


    System.out.println("Factura");
    System.out.println("------------------------------");
    System.out.println("Articulo    " + nombre);
    System.out.println("Precio      " + precUnidad + " €/unidad");
    System.out.println("Cantidad    " + cant);
    System.out.println("Total     " + totalSinIva);

    if (promo=="SINIVA") {
      System.out.println("Descuento         (NO IVA)");
      System.out.println("------------------------------");
      System.out.println("Total con descuento (NO IVA)    " + totalSinIva);
    }
    if (promo=="PROMO50") {
      System.out.println("Descuento (50%)      " + (-1*(totalSinIva/2)));
      System.out.println("IVA al " + (iva*10) + "%      " + (iva*(totalSinIva/2)));
      System.out.println("------------------------------");
      System.out.println("Total con IVA    " + (((-1*(totalSinIva/2)))-(iva*(totalSinIva/2))));
      
    }
    if (promo=="PROMO3X2") {
      System.out.println("");
      System.out.println("IVA al " + (iva*10) + "%      " + ivaResultante);
      System.out.println("------------------------------");
      System.out.println("Total con IVA    " + totalConIva);
      
    }
    if (promo=="NO ") {
      System.out.println("IVA al " + (iva*10) + "%      " + ivaResultante);
      System.out.println("------------------------------");
      System.out.println("Total con IVA    " + totalConIva);
      
    }
    
  
    sc.close();
  }
}  
