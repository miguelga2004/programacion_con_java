/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class Mascota implements MascotaInterface {
  private String chip;
  private String nombre;
  private int edad;
  private boolean vacunada;


  public Mascota() {
  }
  
  public Mascota(String chip, String nombre, int edad) {
    this.chip = chip;
    this.nombre = nombre;
    this.edad = edad;
    this.vacunada = false;
}
  public void vacunar() {
      this.vacunada = true;
  }
  

  public boolean getVacunada() {
    return this.vacunada;
  }
  @Override
  public void pasear() {
  }
  
  public String getNombre() {
    return nombre;
  }
  public String getChip() {
    return chip;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  public int getEdad() {
    return edad;
  }

  @Override
  public String toString() {
    return "Mascota [" + chip + "], nombre, " + nombre + ", edad " + edad;
  }
}
