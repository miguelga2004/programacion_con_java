import java.util.Scanner;
public class EjercicioTablaFilaColumna {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nOperacion = 0;
    boolean repetir;
    String respuesta;
    int cont = 0;
    int numeros[][] = new int[4][10];
    
    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
        numeros[i][j] = (int)(Math.random()*96+5);
      }
    }
    
    System.out.print("        ");
    for (int i = 0; i < numeros[0].length; i++) {
      System.out.printf("%11s", "columna " + i);
    }
    System.out.println();

    for (int i = 0; i < numeros[0].length+1; i++) {
      System.out.print("-----------");
    }


    System.out.println();

    for (int i = 0; i < numeros.length; i++) {
      System.out.printf("%-8s|","Fila " + i);
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.printf("%10d|", numeros[i][j]);
      }
      System.err.println();
    }
    do {
      System.out.println("Que deseas operar con las filas o columnas?1. Filas 2. Columnas");
      nOperacion = sc.nextInt();
    } while (nOperacion < 1 || nOperacion > 2);

    switch (nOperacion) {
      case 1:
      do {

        System.out.println("¿Que operacion quieres hacer con las filas 1. Suma/ 2. Resta/ 3. Mult /4. division/ 5. Media?");
        nOperacion = sc.nextInt();
      } while ((nOperacion<=1)&&(nOperacion>=5));
      switch (nOperacion) {
  
        case 1:
        int suma = 0; 
        System.out.print("        ");
        for (int i = 0; i < numeros[0].length; i++) {
          System.out.printf("%11s", "columna " + i);
        }
        System.out.printf("%11s", "Suma ");
  
        System.out.println();
    
        for (int i = 0; i < numeros[0].length+1; i++) {
          System.out.print("-----------");
        }
    
    
        System.out.println();
    
        for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%-8s|","Fila " + i);
          for (int j = 0; j < numeros[i].length; j++) {
            System.out.printf("%10d|", numeros[i][j]);
            suma += numeros[i][j];
          }
          System.out.printf("%10d", suma);
          suma = 0;
          System.err.println();
        }
          break;
  
        case 2:
        int resta = 0; 
        System.out.print("        ");
        for (int i = 0; i < numeros[0].length; i++) {
          System.out.printf("%11s", "columna " + i);
        }
        System.out.printf("%11s", "Resta ");
  
        System.out.println();
    
        for (int i = 0; i < numeros[0].length+1; i++) {
          System.out.print("-----------");
        }
    
    
        System.out.println();
    
        for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%-8s|","Fila " + i);
          for (int j = 0; j < numeros[i].length; j++) {
            System.out.printf("%10d|", numeros[i][j]);
            resta -= numeros[i][j];
          }
          System.out.printf("%10d", resta);
          resta = 0;
          System.err.println();
        }
          
          break;
  
        case 3:
        System.out.print("        ");
        for (int i = 0; i < numeros[0].length; i++) {
          System.out.printf("%11s", "columna " + i);
        }
        System.out.printf("%11s", "Multiplicacion ");
  
        System.out.println();
    
        for (int i = 0; i < numeros[0].length+1; i++) {
          System.out.print("-----------");
        }
    
    
        System.out.println();
    
        for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%-8s|","Fila " + i);
          long mult = 1; 
          for (int j = 0; j < numeros[i].length; j++) {
            System.out.printf("%10d|", numeros[i][j]);
            mult *= numeros[i][j];
          }
          System.out.printf("%10d", mult);
          mult = 1;
          System.err.println();
        }
          
          break;
  
        case 4:
        System.out.print("        ");
        for (int i = 0; i < numeros[0].length; i++) {
          System.out.printf("%11s", "columna " + i);
        }
        System.out.printf("%11s", "Division ");
  
        System.out.println();
    
        for (int i = 0; i < numeros[0].length+1; i++) {
          System.out.print("-----------");
        }
    
    
        System.out.println();
    
        for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%-8s|","Fila " + i);
          double div = numeros[i][0]; 
          for (int j = 0; j < numeros[i].length; j++) {
            System.out.printf("%10d|", numeros[i][j]);
            div /= (double)numeros[i][j];
          }
          System.out.printf("%10.2f", div);
          div = 1;
          System.err.println();
        }
          
          break;
  
        case 5:
        suma = 0; 
        cont = 0;
        System.out.print("        ");
        for (int i = 0; i < numeros[0].length; i++) {
          System.out.printf("%11s", "columna " + i);
        }
        System.out.printf("%11s", "Media ");
  
        System.out.println();
    
        for (int i = 0; i < numeros[0].length+1; i++) {
          System.out.print("-----------");
        }
    
        System.out.println();
    
        for (int i = 0; i < numeros.length; i++) {
          System.out.printf("%-8s|","Fila " + i);
          for (int j = 0; j < numeros[i].length; j++) {
            System.out.printf("%10d|", numeros[i][j]);
            suma += numeros[i][j];
            cont ++;
          }
          int media = suma/ cont;
          System.out.printf("%10d", media);
    
          System.err.println();
        }
          break;
      }
        break;

      case 2:
      do {
        nOperacion = 0;
        System.out.println("¿Que operacion quieres hacer con las columnas 1. Suma/ 2. Resta/ 3. Mult /4. division/ 5. Media?");
        nOperacion = sc.nextInt();
      } while ((nOperacion<=1)&&(nOperacion>=5));

      switch (nOperacion) {
        case 1:
          System.out.print("        ");
          for (int i = 0; i < numeros[0].length; i++) {
            System.out.printf("%11s", "columna " + i);
          }
          System.out.println();

          for (int i = 0; i < numeros[0].length+1; i++) {
            System.out.print("-----------");
          }


          System.out.println();

          for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%-8s|","Fila " + i);
            for (int j = 0; j < numeros[i].length; j++) {
              System.out.printf("%10d|", numeros[i][j]);
            }
            System.out.println();
          }
          System.out.printf("%-8s|","Suma ");
          for (int i = 0; i < numeros[0].length; i++) {
            int suma = 0;
            for (int j = 0; j < numeros.length; j++) {
              suma += numeros[j][i];
            }
            System.out.printf("%11d", suma);
          }


          break;

        case 2:
          
          break;

        case 3:
          
          break;

        case 4:
          
          break;

        case 5:
          
          break;
      }

        break;
    }
    
    
    
    

    sc.close(); 

  }
}