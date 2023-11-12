/**
 * Salida formateada utilizando enteros, decimales y decimales con precisión
 * 
 * @author Miguel Garcia
 */
public class SalidaFormateada01 {
  public static void main(String[] args) {
    System.out.printf("\033[1mEl numero %d no tiene decimales. \033[0m \n", 21);
    System.out.printf("El numero %f sale con decimales. \n", 21.0);
    System.out.printf("El %.3f sale exactamente con %d decimales. \n", 50.0, 3);
    System.out.printf("Letra: %c. \n", 83);
    System.out.printf("Mostramos el %2$d y despues el primero: %1$.3f. \n", 23.0, 56);
  }
  
}