public abstract class Vehiculo {
  private static int vehiculosCreados = 0;
  private static int kilometroTotales = 0;

  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    vehiculosCreados += 1;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre (int km){
    this.kilometrosRecorridos += km;
    kilometroTotales += km;
  }

  public static int getKilometroTotales() {
    return kilometroTotales;
  }

  

  
  
  
}
