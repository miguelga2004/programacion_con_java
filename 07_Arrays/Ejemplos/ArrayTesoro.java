/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class ArrayTesoro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    final int VACIA = 0;
    final int TESORO = 1;
    final int MINA = 2;
    final int JUGADA = 3;
    int fila;
    int columna;

    int[][] tablero = new int[4][5];

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = VACIA;
      }
    }

    int tesoroFila = (int)(Math.random()*4);
    int tesoroColumna = (int)(Math.random()*5);
    tablero[tesoroFila][tesoroColumna] = TESORO;


    int minaFila;
    int minaColumna;
    do {
      minaFila = (int)(Math.random()*4);
      minaColumna = (int)(Math.random()*5);
    } while ((tesoroFila == minaFila)&&(tesoroColumna==minaColumna));
    tablero[minaFila][minaColumna] = MINA;

    System.out.println("JUEGO DEL TESORO");
    boolean salida = false;

    do {
      for (int i = tablero.length-1; i >= 0; i--) {
        System.out.print(i + " |");
        for (int j = 0; j < tablero[i].length; j++) {
          if (tablero[i][j] == JUGADA) {
            System.out.printf("%2s", "X");
          } else {
            System.out.printf("%2s"," ");
          }
        }
        System.out.println();
      }
      System.out.print("   ");
      for (int i = 0; i < (3*tablero[0].length); i++) {
        System.out.print("-");
      }
      System.out.print("\n   ");
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.printf("%2d", j);
      }
      System.out.println();
      System.out.print("Introduce la fila: ");
      fila = sc.nextInt();
      System.out.print("Introduce la columna: ");
      columna = sc.nextInt();

      switch (tablero[fila][columna]) {
        case VACIA:
          tablero[fila][columna] = JUGADA;
          break;

        case MINA:
          System.out.println("Lo siento, has perdido.");
          salida = true;
          break;

        case TESORO:
        System.out.println("Enhorabuena, has encontrado el tesoro.");
        salida = true;
          break;
        default:
      }
    } while (!salida);

    //Pintamos el tablero final, una vez terminada la partida
    String c = "";
    for (int i = tablero.length - 1; i >= 0; i--) {
      System.out.print(i + " |");
      for (int j = 0; j < tablero[i].length; j++) {
        switch (tablero[i][j]) {
          case VACIA:
            c = " ";
            break;
          case MINA:
            c = "*";
            break;
          case TESORO:
            c = "$";
            break;
          case JUGADA:
            c = "X";
            break;
          default:
        }
        System.out.printf("%2s", c);
      }
      System.out.println();
    }
    System.out.print("   ");
    for (int i = 0; i < (3*tablero[0].length); i++) {
      System.out.print("-");
    }
    System.out.print("\n   ");
    for (int j = 0; j < tablero[0].length; j++) {
      System.out.printf("%2d", j);
    }

    sc.close();
  }
}
