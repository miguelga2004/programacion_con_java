import java.util.HashMap;
import java.util.Scanner;

public class ejemploHash_1 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> m = new HashMap<String, String>();
    m.put("Admin", "1234");
    m.put("User1", "4321");
    m.put("User2", "9876");
    String usuario;
    String pass;
    boolean accede = false;
    int intentos = 3;

    System.out.println("Introduce el usuario ");
    do {
      usuario = sc.nextLine();
      if (m.containsKey(usuario)) {
        if (m.get(usuario).equals(usuario)) {
          System.out.println("Usuario correcto");
          accede = true;
        } else {
          System.out.println("Usuario no existente");
          intentos --;
        }
      }
    } while ((accede = false)&&(intentos>0));

    System.out.println("Introduce la contraseña");
    do {
      pass = sc.nextLine();
      if (m.containsKey(pass)) {
        if (m.get(pass).equals(pass)) {
          System.out.println("Contraseña correcta");  
          accede = true;        
        } else {
          System.out.println("Contraseña incorrecta");
          intentos --;
        }
      }
      intentos--;
    } while ((accede = false)&&(intentos>0));
    sc.close();
  }
}
