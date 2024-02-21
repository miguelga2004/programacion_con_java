public class Libro extends Publicacion implements Prestable{
  
  private boolean prestado = true;
  private String estadoPrestamo = "(no prestado)";


  public Libro(String iSBN, String titulo, int añoPublicacion) {
    super(iSBN, titulo, añoPublicacion);
    this.prestado = prestado;
  }

  @Override
  public void devuelve() {
    prestado = false;
    estadoPrestamo = "(no prestado)";
  }

  @Override
  public boolean estaPrestado() {
    if (prestado==true) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public void presta() {
    String prestado;
    if (!this.prestado) {
      this.prestado = true;
      prestado = "(prestado)";
    }
  }

  

  @Override
  public String toString() {
    return super.toString() + estadoPrestamo;
  }
  
}
