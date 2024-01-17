/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck Thilliez";
    lib.numPaginas = 490;
    System.out.println("El titulo del libro es: " + lib.titulo);
    System.out.println("El autor del libro es: " + lib.autor);
    System.out.println("El numero de paginas del libro es: " + lib.numPaginas);
    System.out.println("La edicion del libro es: " + lib.edicion);
  }
}
