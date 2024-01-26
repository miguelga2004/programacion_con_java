/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
  import java.util.Scanner;
  public class EjercicioTabla {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int nOperacion;
  boolean repetir;
  String respuesta;
  int numeros[][] = new int[4][10];
   
  for (int i = 0; i < numeros.length; i++) {
    for (int j = 0; j < numeros[i].length; j++) {
      numeros[i][j] = (int)(Math.random()*951+50);
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
    do {
      System.out.println("¿Que operacion quieres hacer con las columnas 1. Suma/ 2. Resta/ 3. Mult /4. division/ 5. Media?");
      nOperacion = sc.nextInt();
      } while ((nOperacion<=1)&&(nOperacion>=5));
      
      switch (nOperacion) {
        case 1:
          System.out.printf("%-8s","Suma ");
          int suma = 0;
          for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
              suma += numeros[i][j]; 
            }
          }
          System.out.println(suma);
    
          break;
        case 2:
        System.out.printf("%-8s","Resta ");
        int resta = 0;
        for (int i = 0; i < numeros.length; i++) {
          for (int j = 0; j < numeros[i].length; j++) {
            resta -= numeros[i][j]; 
          }
        }
        System.out.println(resta);
          break;
        case 3:
        System.out.printf("%-8s","Multiplicacion ");
        long mult = 1;
        for (int i = 0; i < numeros.length; i++) {
          for (int j = 0; j < numeros[i].length; j++) {
            mult *= numeros[i][j]; 
          }
        }
        System.out.println(mult);
          break;
        case 4:
        System.out.printf("%-8s","Division ");
        double division = 1;
        for (int i = 0; i < numeros.length; i++) {
          for (int j = 0; j < numeros[i].length; j++) {
            division /= (double)numeros[i][j]; 
          }
        }
        System.out.println(division);
          break;
        case 5:
        System.out.printf("%-8s","Media ");
        int media;
        suma = 0;
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
          for (int j = 0; j < numeros[i].length; j++) {
            suma += numeros[i][j]; 
            cont++;
          }
        }
        media = suma/cont;
        System.out.println(media);
          break;
      
        default:
          break;
      }
      repetir = false;
      System.out.println("¿Quieres realizar otra operacion con estos numero?");
      respuesta = sc.next();
      if (respuesta.equalsIgnoreCase("si")) {
        repetir = true;
      }
  } while (repetir);
  
  

  sc.close(); 
  }
}
