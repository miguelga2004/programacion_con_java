public class AppAlumnos {
  public static void main(String[] args) {
    Alumno[] alumnos = new Alumno[5];
    String nombre;
    double notaMedia;

    for (int i = 0; i < alumnos.length; i++) {
      alumnos[i] = new Alumno();
      System.out.print("Nombre del alumno " + i + " : ");
      nombre = System.console().readLine();
      alumnos[i].setNombre(nombre);
      System.out.print("Nota del alumno: " + i + " : ");
      notaMedia = Double.parseDouble(System.console().readLine());
      alumnos[i].setNotaMedia(notaMedia);
    }

    // for (Alumno alumno : alumnos) {
    //  System.out.println(alumno.toString());
    // }

      for (Alumno alumno : alumnos) {
        System.out.println("El alumno " + alumno.getNombre() + " tiene de media la nota: " + alumno.getNotaMedia());
      }

    }
}
