/**
 * T07Ejercicio05
 */
public class T07Ejercicio05 {
  public static void main(String[] args) {
    int[] numero = new int[10];
    int maximo = Integer.MAX_VALUE;
    int minimo = Integer.MIN_VALUE;

    System.out.println("Introduzca numeros enteros y pulse INTRO");

    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());

      if (i > maximo) {
        maximo = i;
      }

      if (i < minimo) {
        minimo = i;
      } 
    }
    System.out.println("Tus numeros son: ");
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
      if (numero[i] == maximo) {
        System.out.print(" maximo");
      }
      if (numero[i] == minimo) {
        System.out.print(" minimo");
      }
      System.out.println("");
    }
  }
}