/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Estudiante extends Persona {
  private int creditos;

  public Estudiante(String nombre, int edad, String dni){
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos){
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return this.creditos;
  }

  public void mostrarDatos() {
    super.mostrarDatos();
    System.out.println("Estudiante matriculado de " + creditos + " creditos");
  }

  @Override
  public String toString() {
    return super.toString() + " creditos " + creditos;
  }





}
