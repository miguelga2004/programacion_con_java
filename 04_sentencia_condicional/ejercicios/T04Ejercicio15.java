import java.util.Scanner;
public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce que c quieres que complete la piramide: ");
    String c = sc.nextLine();
    sc.close();
   
    System.out.println("        " + c);
    System.out.println("       " + c + c + c);
    System.out.println("      " + c + c + c + c + c);
    System.out.println("     " + c + c + c + c + c + c + c);
    System.out.println("    " + c + c + c + c + c + c + c + c + c);
  
  }
}
