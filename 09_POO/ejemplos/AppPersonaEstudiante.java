/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Rodriguez", 30, "123456789A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "555444B");
    Profesor prof = new Profesor("Sergio Sanchez", 33, "987654321B", "Informatica", 10000.25);

    System.out.println(p.toString());
    System.out.println(p);

    System.err.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);
  }
}
