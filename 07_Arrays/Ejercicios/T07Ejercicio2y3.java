/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class T07Ejercicio2y3 {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;
    
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900+100);
        // System.out.println(tabla[fila][columna]);
      }
    }

    
    for (fila = 0; fila < tabla.length; fila++) {
      int sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila += tabla[fila][columna];        
      }
      System.out.printf("%8d\n", sumaFila);
  }
    for (columna = 0; columna < 48; columna++) {
      System.out.print("-");
    }

    System.out.println();

    int sumaColumna;
    int sumaTotal = 0;

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < tabla.length; fila++) {
       sumaColumna += tabla[fila][columna];
      }
      System.out.printf("%8d", sumaColumna);
      sumaTotal += sumaColumna;
    }

    System.out.printf("%8d", sumaTotal);
    
}
}

