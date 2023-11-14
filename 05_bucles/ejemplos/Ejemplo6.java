public class Ejemplo6 {
  public static void main(String[] args) {
    int numero = 0;

    do {
      System.out.print("Introduce un numero par: ");
      numero = Integer.parseInt(System.console().readLine());

      if (numero % 2 == 0) {
        System.out.println("Ay que bonito es el numero par " + numero);
      } else {
        System.out.println("Adios no me gustan los numero impares como  " + numero);
      }
    } while (numero % 2 == 0);
  }
}
