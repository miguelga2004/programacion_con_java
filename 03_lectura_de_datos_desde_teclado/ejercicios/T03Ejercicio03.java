/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
  int pesetas;
  Scanner sc = new Scanner(System.in);

  System.out.print("Introduce la cantidad de pesetas que quieres pasar a euros: ");
  pesetas = sc.nextInt();

<<<<<<< HEAD
  System.out.println("El resultado de convertir " + pesetas + " a pesetas es " + pesetas/166.384);

  sc .close();
  }
}
=======
  System.out.printf("El resultado de convertir pesetas a euros es %.0f%n", pesetas/166.384);

  sc .close();
  }
}
>>>>>>> 6157ce126d711bc61c04a822dd3ab15ebcce7a55
