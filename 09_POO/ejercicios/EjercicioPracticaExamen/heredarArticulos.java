public class heredarArticulos {
  private int codigo;
  private String descripcion;

  public heredarArticulos(int codigo, String descripcion) {
    this.codigo = codigo;
    this.descripcion = descripcion;
  }

  public heredarArticulos() {
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "codigo = " + codigo + ", descripcion = " + descripcion;
  }

  
  
}
