public class Revista extends Publicacion{
  int numero;

  public Revista(String iSBN, String titulo, int añoPublicacion, int numero) {
    super(iSBN, titulo, añoPublicacion);
    this.numero = numero;
  }

  @Override
  public String toString() {
    String entidad = "Revista";
    return  entidad + super.toString() + " con numero " + numero;
  }
} 
