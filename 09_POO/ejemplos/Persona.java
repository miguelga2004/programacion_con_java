/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Persona {
  private String nombre;
  private int edad;
  private String dni;

  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  public void mostrarDatos() {
    System.out.println("Nombre: " + nombre + " edad: " + edad + " DNI: " + dni);
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + " edad: " + edad + " DNI: " + dni;
  }
  

  
}
