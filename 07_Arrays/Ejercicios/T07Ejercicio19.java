public class T07Ejercicio19 {
  public static void main(String[] args) {
    int[] num = new int[12];
    for (int i = 0; i < num.length; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println("Array original: ");

    System.out.print("Indice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }

    System.out.print("\nIntroduzca el numero que quiere insertar: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posicion donde lo quiere insertar: ");
    int posicion = Integer.parseInt(System.console().readLine());

    for (int i = num.length-1; i < posicion; i--) {
      num[i] = num[i-1];
    }
    
    num[posicion] = numero;

    System.out.print("Indice ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%4d", num[i]);
    }
  }
}
