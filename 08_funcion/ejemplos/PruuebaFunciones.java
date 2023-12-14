import matematicas.Varias;
import matematicas.Volumen;
public class PruuebaFunciones {
  public static void main(String[] args) {
    int n;

    System.out.print("Introduzca un numero entero positivo: ");
    n = Integer.parseInt(System.console().readLine());
    
    if (Varias.esPrimo(n)) {
      System.out.println("El " + n + " es primo.");
    } else {
      System.out.println("El " + n + " no es primo.");
    }


    System.out.print("Introduce un numero: ");
    n = Integer.parseInt(System.console().readLine());
    
    int numDigitos = Varias.digitos(n);
    System.out.println(n+ " tiene " + numDigitos + " digitos.");

    double r;
    double h;
    System.out.println("Introduzca el radio del cilindro: ");
    r = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca la altura del cilindro: ");
    h = Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilidro es " + Volumen.volumenCilindro(r,h) + "cm^3");
  }
}

