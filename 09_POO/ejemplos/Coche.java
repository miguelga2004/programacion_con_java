/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Coche {
  
  //////////Atributos
  private String matricula;
  private String marca;
  private String modelo;
  private int kilometraje;
  private static int kilometrajeTotal = 0;

  public Coche(String matricula, String marca, String modelo) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.kilometraje = 0;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void recorre (int cantidad){
    this.kilometraje += cantidad;
    kilometrajeTotal += cantidad;
  }

  public static int getKilometrajeTotal() {
    return kilometrajeTotal;
  }
  
  
  
}
