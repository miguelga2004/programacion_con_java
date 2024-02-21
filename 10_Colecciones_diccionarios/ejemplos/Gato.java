public class Gato {
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;

  Gato(String nombre) {
    this.nombre = nombre;
  }

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
  }

  void maulla() {
    System.out.println("Miaaaaaau!");
  }

  void ronronea() {
    System.out.println("Brrrrrrrrrr!");
  }

  void come() {
    System.out.println("Ñam!!");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("Pescado")) {
      System.out.println("Ñam!!");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

  @Override
  public String toString() {
    return "Gato [nombre=" + nombre + ", color=" + color + ", raza=" + raza + ", sexo=" + sexo + ", edad=" + edad
        + ", peso=" + peso + "]";
  }

  void peleaCon(Gato contrincante) {
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aqui, que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }
}
