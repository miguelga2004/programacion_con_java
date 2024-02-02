/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Profesor extends Persona {
  private String departamentos;
  private double sueldo;

  public Profesor(String nombre, int edad, String dni, String departamentos, double sueldo) {
    super(nombre, edad, dni);
    this.departamentos = departamentos;
    this.sueldo = sueldo;
  }

  public String getDepartamentos() {
    return departamentos;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + " con departamentos " + departamentos + " con suledo " + sueldo;
  }

  
  
  
}
