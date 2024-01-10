/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
  import java.util.Scanner;
public class Array02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = {26, 30, 0, 100, 50};

    System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4]);

    int suma = n[3] + n[4];
    System.out.println("El resultado es " + suma);

    System.out.println("Quieres saber el valor de alguno de los elementos " + n.length);
    int indice = sc.nextInt();
    
    System.out.println("El elemento que se encuentra en la posicion " + indice + " es el " + n[indice]);
    
    sc.close();

  }
}
