public class T02Ejercicio05 {
  public static void main(String[] args) {
    int pesetas = 1164;
    double euros = (pesetas / 166.386);

    System.out.println("De pta a € --> " + euros);
    System.out.printf("%d pta --> %.2f € \n", pesetas, euros);
  }
}
