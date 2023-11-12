import java.util.Scanner;
public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el numero que quieras tratar: ");
    int num = sc.nextInt();
    sc.close();
   
    if (num<10) {
      System.out.println("El numero es :" + num);
    }

    if ((num>=10)&&(num<100000)) {
      System.out.println("El numero es: " + num%10);
    }
  }
}
