/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float nota1;
    float notaDeseada;
    float notaNecesaria;
    float calcNota2;

    System.out.print("Introduce la nota del primer examen: ");
    nota1 = sc.nextFloat();

    System.out.print("Introduce la nota deseada: ");
    notaDeseada = sc.nextFloat();
   
    calcNota2 = (notaDeseada-(nota1*0.4f));
    notaNecesaria = (10*calcNota2)/6;

    System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaNecesaria + " en el segundo examen");
    
    sc .close();
  }
}