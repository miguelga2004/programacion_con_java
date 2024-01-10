public class ArrayBidimensional01 {
  public static void main(String[] args) {
    int[][] n = new int[3][2]; 
    n[0][0] = 20;
    n[1][0] = 67;
    n[1][1] = 33;
    n[2][1] = 7;
    
    System.out.println("Numero de filas: " + n.length);
    System.out.println("Numero de filas: " + n[0].length);

    for (int fila = 0; fila < n.length; fila++) {
      System.out.print("Fila " + fila + " ");
      for (int columna = 0; columna < n[fila].length; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
      }
      System.out.println();
    }

  }
}
