import java.util.Scanner;
public class Ejercicio12_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  
    int[] original = new int[10];
    int[] copia = new int[10];
    boolean continuar;
    int nFinal;
    int nInicial;

    for (int i = 0; i < original.length; i++) {
      original[i] = sc.nextInt();
    }

    System.out.println("Array original: ");

    System.out.print("Indice ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < original.length; i++) {
      System.out.printf("%4d", original[i]);
    }

    
    System.out.println();
    do {
    continuar = true;
    System.out.println("Introduce inicial");
    nInicial = sc.nextInt();

    System.out.println("Introduce final");
    nFinal = sc.nextInt();

    if (nFinal <= nInicial) {
      System.out.println("Incorrecto. El numero inicial debe ser inferior.");
      continuar=false;
    }

    if ((nFinal<0) || (nFinal>9) || (nInicial<0) || (nInicial>9)) {
      System.out.println("ERROR. Debes introducir un numero (0-9)");
      continuar = false;
    } 
    } while (!continuar);
    
    for (int i = 0; i < copia.length; i++) {
      copia[i] = original[i];
    }

    copia[nFinal] = original[nInicial];

    for (int i = nFinal+1; i < copia.length; i++) {
      copia[i] = original[i-1];
    }

    copia[0] = original[original.length-1];

    for (int i = nFinal+1; i < copia.length; i++) {
      copia[i] = original[i-1];
    }

    for (int i = 0; i < nInicial; i++) {
      copia[i+1] = original[i];
    }

    System.out.println("Array copia: ");

    System.out.print("Indice ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", i);
    }

    System.out.print("\nValor  ");
    for (int i = 0; i < copia.length; i++) {
      System.out.printf("%4d", copia[i]);
    }



  
    sc.close();
  }
}
