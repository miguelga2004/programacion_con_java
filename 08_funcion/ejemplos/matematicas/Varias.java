package matematicas;

/**
 * Funciones matemáticas de propósito general
 * 
 * @author Sergio Sánchez
 */
public class Varias {

  /**
   * Comprueba si un número entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * 
   * @param x un número entero positivo
   * @return boolean <code>true</code> si el número es primo o <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    
    return true;
  }

  /**
   * Devuelve el número de dígitos que contiene un número entero
   * 
   * @param x un número entero
   * @return int la cantidad de dígitos que contiene el número
   */
  public static int digitos(int x) {
    
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  
  /** 
   * Voltear un número introducido por teclado
   * @param x un numero de tipo long 
   * @return long el numero volteado
   */
  public static long voltear(long x){
    if (x < 0) {
      return voltear(-x);
    }
    long numVolt = 0;
    while (x > 0) {
      numVolt = (numVolt*10) + (x%10);
      x /= 10;
    }
    return numVolt;
  }

  
  /** 
   * Voltearun nu introducido por teclado, llamando a la funcion original que devuelve un long
   * @param x Un numero entero
   * @return int Devuelve int castando el resultado de llamar a la funcion long voltea()
   */
  public static int voltear(int x){
    return (int) voltear((long)x);
  }

  
  /** 
   * @param x
   * @return boolean
   */
  public static boolean esCapicua(long x){
  return x == voltear(x);
  }

  
  /** 
   * @param x
   * @return boolean
   */
  public static boolean esCapicua(int x){
  return esCapicua((long)x);
  }

  
  /** 
   * @param x
   * @return int
   */
  public static int siguientePrimo(int x){
  while (!esPrimo(++x)) {
  }
  return x;
  }

 
 /** 
  * @param numIntroducido
  * @return long
  */
 public static long fibonacci(int numIntroducido){
    int a = 0;
    int b = 1;

    for (int i = 0; i < numIntroducido; i++) {
        int c = a + b;
        a = b;
        b = c;
        System.err.print(a + " ");
    }
    return b;
  }

  
  /** 
   * @param base
   * @param exponente
   * @return long
   */
  public static long potencia(int base, int exponente) {
      return (long) Math.pow(base, exponente);
  }

  
}



