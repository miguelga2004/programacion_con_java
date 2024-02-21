import java.util.Scanner;
public class AppDiscos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Disco[] disco = new Disco[100];

    for (int i = 0; i < disco.length; i++) {
      disco[i] = new Disco();
    }

    System.out.println("¿Cuantos discos quieres introducir?");
    int numDiscos = sc.nextInt();

    for (int i = 0; i < numDiscos; i++) {
      System.out.print("Cual es el codigo del disco: ");
      String codigoDisco = sc.nextLine();
      disco[i].setCodigo(codigoDisco);

      System.out.print("Cual es el autor del disco: ");
      String autorDisco = sc.nextLine();
      disco[i].setAutor(autorDisco);

      System.out.print("Cual es el titulo del disco: ");
      String tituloDisco = sc.nextLine();
      disco[i].setTitulo(tituloDisco);

      System.out.print("Cual es el genero del disco: ");
      String generoDisco = sc.nextLine();
      disco[i].setGenero(generoDisco);

      System.out.print("Cual es la duracion del disco: ");
      int duracionDisco = sc.nextInt();
      disco[i].setDuracion(duracionDisco);
    }
      
    for (int i = 0; i < disco.length; i++) {
      if (disco[i].getAutor() != null) {
        System.out.println(disco[i].toString());
      }
    }
    sc.close();
  }
}
