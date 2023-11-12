import java.util.Scanner;
public class practiaexamen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el primer numero: ");
    float num1 = sc.nextFloat();

    System.out.print("Introduce el primer numero: ");
    float num2 = sc.nextFloat();

    float IVA = (float)((num1 + num2) * 0.21);
    float total = (float)((num1 + num2) * 1.21);

    System.out.printf("IVA %19.2f \n", IVA);
    System.out.println("-----------------------");
    System.out.printf("Total %18.2f \n", total);

    sc.close();
  }
}
