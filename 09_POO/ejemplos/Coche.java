/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Coche {
  
  //////////Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    Coche miCoche = new Coche();
    Coche tuCoche = new Coche();
    miCoche.matricula = "3434cdv";

    System.out.println("Matricula del coche 1: " + miCoche.matricula);
    System.out.println("Potencia del coche 1: " + miCoche.potencia);
    System.out.println("Matricula del coche 2: " + tuCoche.matricula);
    System.out.println("Potencia del coche 2: " + tuCoche.potencia);

  }

}
