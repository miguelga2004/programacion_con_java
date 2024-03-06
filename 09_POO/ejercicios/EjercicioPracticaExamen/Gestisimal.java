public class Gestisimal extends heredarArticulos {
  
  private float precioCompra;
  private float precioVenta;
  private int nUnidades;
  
  public Gestisimal() {
  }

  public Gestisimal(int codigo, String descripcion, float precioCompra, float precioVenta, int nUnidades) {
    super(codigo, descripcion);
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.nUnidades = nUnidades;
  }

  public float getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(float precioCompra) {
    this.precioCompra = precioCompra;
  }

  public float getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(float precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getnUnidades() {
    return nUnidades;
  }

  public void setnUnidades(int nUnidades) {
    this.nUnidades = nUnidades;
  }

  @Override
  public String toString() {
    return super.toString() + "precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", nUnidades=" + nUnidades
        + "]";
  }
  
  
  
}
