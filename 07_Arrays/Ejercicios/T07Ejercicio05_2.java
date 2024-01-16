/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class T07Ejercicio05_2 {
  public static void main(String[] args) {
    int[][] tabla = new int[6][10];
    int fila;
    int columna;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    int minimo = Integer.MAX_VALUE; 
    int maximo = Integer.MIN_VALUE;
    
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*1001);
        if (tabla[fila][columna]<minimo) {
          minimo = tabla[fila][columna]; 
          columnaMinimo = columna;
          filaMinimo = fila;
        } 

        if (tabla[fila][columna]>maximo) {
          maximo = tabla[fila][columna]; 
          columnaMaximo = columna;
          filaMaximo = fila;
        }

        System.out.printf("%5d", tabla[fila][columna]);
        
      }
      System.out.println();
    }

    System.out.printf("%5s\n",minimo);
    System.out.printf("%5d en posicion " + filaMinimo + " en la columna " + columnaMinimo + "\n", minimo);    
    System.out.printf("%5d en posicion " + filaMaximo + " en la columna " + columnaMaximo, maximo);    
}
}

