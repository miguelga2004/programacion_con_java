public class NumeroAleatorio {
  public static void main(String[] args) {
      String[][] quiniela = new String[14][3];
      String[] resultados = new String[15];
      int[] aciertos = new int[3]; 

      for (int i = 0; i < 14; i++) { // Solo para los primeros 14 partidos
          int resultadoPartido = (int) (Math.random() * 3);
          resultados[i] = resultadoPartido == 0 ? "1" : resultadoPartido == 1 ? "X" : "2";
      }

      // Generar apuestas aleatorias y contar aciertos
      for (int i = 0; i < quiniela.length; i++) {
          for (int j = 0; j < quiniela[i].length; j++) {
              int apuesta = (int) (Math.random() * 3); // Genera 0, 1 o 2
              quiniela[i][j] = apuesta == 0 ? "1" : apuesta == 1 ? "X" : "2";

              // Contar aciertos para los primeros 14 partidos
              if (i < 14 && quiniela[i][j].equals(resultados[i])) {
                  aciertos[j]++;
              }
          }
      }

      // Resultado para el Pleno al 15
      resultados[14] = (Math.random() < 0.5 ? "M" : "0") + " | " + (Math.random() < 0.5 ? "M" : "0");

      // Imprimir apuestas
      for (int i = 0; i < quiniela.length; i++) {
          System.out.printf("%2d. ", i + 1);
          for (int j = 0; j < quiniela[i].length; j++) {
              System.out.print(quiniela[i][j]);
              if (j < quiniela[i].length - 1) {
                  System.out.print("  |  "); // Separar cada apuesta con una barra
              }
          }
          // Solo para el Pleno al 15 imprimir el resultado
          if (i == 14) {
              System.out.print(" | " + resultados[14]);
          }
          System.out.println();
      }

      // Verificar y mostrar aciertos por cada columna
      System.out.println("\nAciertos por columna:");
      for (int i = 0; i < aciertos.length; i++) {
          System.out.println("Columna " + (i + 1) + ": " + aciertos[i] + " aciertos");
      }
  }
}
