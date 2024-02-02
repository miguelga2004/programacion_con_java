import java.util.Scanner;

public class Ejercicio2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    boolean continuar = true;
    int filas;
    int columnas;
    int fila1;
    int col1;
    int fila2;
    int col2;
    int filaSuma;
    int colSuma;

    System.out.println("Introduce el numero de filas que desea que contenga la tabla: ");
    filas = sc.nextInt();
    
    System.out.println("Introduce el numero de columnas que tendra la tabla");
    columnas = sc.nextInt();
    
    System.out.println("Introduce el numero maximo aleatorio de la tabla.");
    int maxAleatorio = sc.nextInt();

    int[][] tabla = new int [filas][columnas];

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
        //Aqui se genera la tabla aleatoriamente
        System.out.println("Introduce los valores que tendra la tabla.");
        for (int i = 0; i < tabla.length; i++) {
          for (int j = 0; j < tabla[i].length; j++) {
            tabla[i][j] = (int)(Math.random()*maxAleatorio+1);
          }      
        }
          break;


        case 2:
          // Aqui se crea la tabla manualmente
        System.out.println("Introduce los valores que tendra la tabla.");
          for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
              tabla[i][j] = sc.nextInt();
            }      
            
          }
          break;

          
        case 3:
          //Aqui se muestra la tabla
          for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
              System.out.printf("%8d|", tabla[i][j]);
            }
            System.out.println();
          }
          break;


        case 4:
        //Aqui se intercambian las filas. Estoy teniendo en cuenta que el usuario sabe que el primer espacio de la
        //array es 0, el segundo 1... etc. Porque no se especifica. En querer hacerlo intuitivo solo seria sumar +1.
        //Y despues restar 1 en los bucles en el indice.

        int auxiliarFila[] = new int [columnas];
        do {
        System.out.println("Introduce la fila que deseas intercambiar");
        fila1 = sc.nextInt();
        System.out.println("Introduce la segunda fila que deseas intercambiar");
        fila2 = sc.nextInt();
        //El while no funciona correctamente pero el funcionamiento de intercambiar si
        } while (((fila1<=0&&fila1>tabla.length)&&(fila2<=0&&fila2>tabla.length)&&tabla==null));
        

        for (int i = 0; i < tabla.length; i++) {
          auxiliarFila[i] = tabla[fila1][i];
        }
        
        for (int i = 0; i < tabla.length; i++) {
          tabla[fila1][i] =  tabla[fila2][i];
        }
        
        for (int i = 0; i < auxiliarFila.length; i++) {
          tabla[fila2][i] = auxiliarFila[i];
        }

          break;


        case 5:
        int auxiliarCol[] = new int [columnas];
        do {
        System.out.println("Introduce la columna que deseas intercambiar");
        col1 = sc.nextInt();
        System.out.println("Introduce la segunda columna que deseas intercambiar");
        col2 = sc.nextInt();
        //El while no funciona correctamente ni el funcionamiento de intercambiar
        } while (((col1<=0&&col1>tabla.length)&&(col2<=0&&col2>tabla.length)&&tabla==null));
        

        for (int i = 0; i < tabla.length; i++) {
          auxiliarCol[i] = tabla[col1][i];
        }
        
        for (int i = 0; i < tabla.length; i++) {
          tabla[col1][i] =  tabla[col2][i];
        }
        
        for (int i = 0; i < auxiliarCol.length; i++) {
          tabla[col2][i] = auxiliarCol[i];
        }

          break;


        case 6:
        //Aqui se suma la fila que se introduzca
          int acumuladorFila = 0;
          System.out.println("Que fila quieres sumar: ");
          filaSuma = sc.nextInt();
          for (int i = 0; i < tabla[filas].length; i++) {
            acumuladorFila += tabla[filas][i];
          }
          System.out.println("El resultado es " + acumuladorFila);
          break;


        case 7:
        //Aqui se suma la columna que se introduzca
          int acumuladorColumna = 0;
          System.out.println("Que columna quieres sumar: ");
          colSuma = sc.nextInt();

          for (int i = 0; i < tabla.length; i++) {
            acumuladorColumna += tabla[i][colSuma];
          }

          System.out.println("El resultado es " + acumuladorColumna);
          break;


        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
    sc.close();
  }
}


