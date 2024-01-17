/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class PruebaGato {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);

    // Gato botas = new Gato("Botas", "Naranja", "Egipcio", "Macho", 5, 4.2);

    // System.out.println(botas.nombre);
    // System.out.println(botas.color);
    // System.out.println(botas.raza);
    // System.out.println(botas.sexo);
    // System.out.println(botas.edad);
    // System.out.println(botas.peso);

    System.out.print("Cuantos gatos quieres crear: ");
    int num = sc.nextInt();

    Gato[] gaticos = new Gato[num];
    String[] nombres = {"Garfield", "Botas", "Willy", "Pancho", "Misifú"};
    String[] colores = {"Marron", "Negro", "Pardo"};
    
    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("Que raza deseas: ");
      String raza = sc.next();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 4, 3);
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.print(gaticos[i].nombre + " ");
      System.out.println(gaticos[i].color);
    }
    
  

    // Gato kitty = new Gato();
    // kitty.sexo = "hembra";

    // garfield.come();
    // garfield.peleaCon(kitty);
    // garfield.maulla();
    // garfield.ronronea();




    // System.out.println("1,2,3");
    // int ejemplo = sc.nextInt();

    // String comida;

    // switch (ejemplo) {
    //   case 1:
    //     System.out.println("Que comida va a comer");
    //     comida = sc.nextLine();
    //     garfield.come(comida);
    //     break;

    //   case 2:
    //     garfield.ronronea();
    //     break;

    //   case 3:
    //     garfield.maulla();
    //     break;

    //   case 4:
    //     garfield.peleaCon(kitty);
    //     break;
    
    //   default:
    //     break;
    // }

    sc.close();
    
  }
}
