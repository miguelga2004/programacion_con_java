public class T02Ejercicio04 {
  public static void main(String[] args) {
    double euros = 6;
    int pesetas = (int)(euros * 166.386);

    System.out.println("€ --> " + pesetas + " pta");
    System.out.printf("%.2f € --> %d pta \n", euros, pesetas);
  }
}
