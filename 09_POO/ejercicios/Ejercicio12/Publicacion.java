public class Publicacion {
  private String ISBN;
  private String titulo;
  private int añoPublicacion;

  public Publicacion(String iSBN, String titulo, int añoPublicacion) {
    ISBN = iSBN;
    this.titulo = titulo;
    this.añoPublicacion = añoPublicacion;
  }

  @Override
  public String toString() {
    return "Publicacion [ISBN=" + ISBN + ", titulo=" + titulo + ", añoPublicacion=" + añoPublicacion + "]";
  } 

  
  
} 