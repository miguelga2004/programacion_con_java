/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.Scanner;

public class ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dia;

    System.out.print("Introduce un dia de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1, 2, 3, 4, 5:
        System.out.println("Es dia lectivo");
        break;

      case 6, 7:
        System.out.println("Es fin de semana");
        break;

      default:
      System.out.println("Dia no valido");
        break;
    }
      // switch (dia) {
    //   case 1:
    //     System.out.println("Es dia lectivo");
    //     break;

    //   case 2:
    //     System.out.println("Es dia lectivo");
    //     break;

    //   case 3:
    //     System.out.println("Es dia lectivo");
    //     break;

    //   case 4:
    //     System.out.println("Es dia lectivo");
    //     break;

    //   case 5:
    //     System.out.println("Es dia lectivo");
    //     break;
    
    //   case 6:
    //     System.out.println("Es fin de semana");
    //     break;

    //   case 7:
    //     System.out.println("Es fin de semana");
    //     break;
    //   default:
    //   System.out.println("Dia no valido");
    //     break;
    // }

  }
}
