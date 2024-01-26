public class Ejercicio12 {
  public static void main(String[] args) {
      int[] numeros = new int[10];
      int auxInicial = 0;

      System.out.print("Introduzca 10 números: ");
      for (int i = 0; i < numeros.length; i++) {
          numeros[i] = Integer.parseInt(System.console().readLine());
      }

      System.out.print("índice: ");
      for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%3d", i);
      }
      System.out.println();
      System.out.print("Valor:  ");
      for (int j = 0; j < numeros.length; j++) {
          System.out.printf("%3d", numeros[j]);
      }
    
      System.out.println("\nIntroduzca posicion inicial: ");
      int posicionInicial = Integer.parseInt(System.console().readLine());
      System.out.println("Introduzca posicion final: ");
      int posicionFinal = Integer.parseInt(System.console().readLine());

      if ((posicionInicial < posicionFinal) && (posicionInicial >= 0 && posicionFinal <= 9)) {
          auxInicial = numeros[posicionInicial];

          for (int i = posicionInicial; i < posicionFinal; i++) {
              int temp = numeros[i + 1];
              numeros[i + 1] = auxInicial;
              auxInicial = temp;
          }

          System.out.print("\níndice: ");
          for (int i = 0; i < numeros.length; i++) {
              System.out.printf("%3d", i);
          }
          System.out.println();
          System.out.print("Valor:  ");
          for (int i = 0; i < numeros.length; i++) {
              System.out.printf("%3d", numeros[i]);
          }
          System.out.println();
      }
  }
}