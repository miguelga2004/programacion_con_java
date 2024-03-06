/**
 * 
 * @author Miguel Garcia
 */
public class Gato extends Mascota {
  private static int totalGatos = 0; // Contador estático para llevar el total de instancias de Gato.
  private String pelaje; // Atributo para almacenar el tipo de pelaje del gato.

  public Gato(String chip) {
      super(chip, "Desconocido", 0);
      totalGatos++;
  }

  public Gato(String chip, String nombre) {
      super(chip, nombre, 0);
      totalGatos++;
  }

  public void maulla() {
      System.out.println("¡Miaaaaauuuuuu! Brrrrr….");
  }

  public void bufar() {
      System.out.println("Fuuuu...");
  }

  @Override
  public void pasear() {
      if (!this.getVacunada()) { // Si el gato no está vacunado, no puede pasear.
          System.out.println(this.getNombre() + " no puede pasear hasta no estar vacunado/a");
      } else {
          // Si el gato está vacunado, maulla y bufar al pasear.
          this.maulla();
          this.bufar();
      }
  }

  @Override
  public void vacunar() {
      if (this.getVacunada()) {
          System.out.println(this.getNombre() + " ya se encuentra vacunado/a");
      } else {
          super.vacunar(); // Llama al método vacunar de la clase base para cambiar el estado de vacunación.
          bufar(); // El gato bufa al ser vacunado.
      }
  }

  public static int getTotalGatos() {
      return totalGatos;
  }

  public String getPelaje() {
      return pelaje;
  }

  public void setPelaje(String pelaje) {
      this.pelaje = pelaje;
  }
}
