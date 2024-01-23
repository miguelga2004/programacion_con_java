public class T07Ejercicio05_2 {
  public static void main(String[] args) {
    int[][] tabla = new int[6][10];
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;

    for (int fila = 0; fila < tabla.length; fila++) {
      for (int columna = 0; columna < tabla[fila].length; columna++) {
        boolean numeroRepetido;
        do {
          numeroRepetido = false;
          tabla[fila][columna] = (int)(Math.random() * 60)+1;

          boolean detenerBusqueda = false;
          for (int i = 0; i < tabla.length && !numeroRepetido && !detenerBusqueda; i++) {
            for (int j = 0; j < tabla[i].length && !numeroRepetido; j++) {
              if (i == fila && j == columna) {
                detenerBusqueda = true;
              } else if (tabla[i][j] == tabla[fila][columna]) {
                numeroRepetido = true;
              }
            }
          }
        } while (numeroRepetido);

        if (tabla[fila][columna] < minimo) {
          minimo = tabla[fila][columna];
          columnaMinimo = columna;
          filaMinimo = fila;
        }

        if (tabla[fila][columna] > maximo) {
          maximo = tabla[fila][columna];
          columnaMaximo = columna;
          filaMaximo = fila;
        }

        System.out.printf("%5d", tabla[fila][columna]);
      }
      System.out.println();
    }

    System.out.printf("Mínimo: %5d en posición [%d, %d]\n", minimo, filaMinimo, columnaMinimo);
    System.out.printf("Máximo: %5d en posición [%d, %d]\n", maximo, filaMaximo, columnaMaximo);
  }
}
