import java.util.ArrayList;

public class ejemplo09 {
  public static void main(String[] args) {
    ArrayList<Gato> camada = new ArrayList<Gato>();
    camada.add(new Gato("Misifu", "naraja", "persa", "macho", 10, 5));
    camada.add(new Gato("Garfield", "naraja", "siames", "macho", 10, 5));
    System.out.println("Listado de gatos:");
    for (int i = 0; i < args.length; i++) {
      System.out.println(camada.toString());
    }
  }  
}
