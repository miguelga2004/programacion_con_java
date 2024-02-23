import java.util.Scanner;

public class AppDiscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Disco[] disco = new Disco[100];
        boolean salida = false;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1. Añadir disco");
            System.out.println("2. Quitar disco");
            System.out.println("3. Modificar disco");
            System.out.println("4. Mover disco de posicion a la izquierda para que no dejen espacios vacios");
            System.out.println("5. Ver todos los discos");
            System.out.println("6. Salir del programa");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("¿En que posicion quieres introducir el disco?");
                    int posicion = sc.nextInt();
                    sc.nextLine(); // Consume el salto de línea restante
                    
                    Disco nuevoDisco = new Disco(); // Crea un nuevo disco aquí
                    
                    System.out.print("Cual es el codigo del disco: ");
                    nuevoDisco.setCodigo(sc.nextLine());

                    System.out.print("Cual es el autor del disco: ");
                    nuevoDisco.setAutor(sc.nextLine());

                    System.out.print("Cual es el titulo del disco: ");
                    nuevoDisco.setTitulo(sc.nextLine());

                    System.out.print("Cual es el genero del disco: ");
                    nuevoDisco.setGenero(sc.nextLine());

                    System.out.print("Cual es la duracion del disco: ");
                    nuevoDisco.setDuracion(sc.nextInt());

                    disco[posicion - 1] = nuevoDisco; // Asigna el nuevo disco a la posición seleccionada
                    
                    break;

                case 2:
                    System.out.println("¿Cual es la posicion del disco que deseas eliminar?");
                    int eliminar = sc.nextInt();
                    disco[eliminar - 1] = null;

                    break;

                case 3:
                    System.out.print("Que posicion tiene el disco que deseas modificar: ");
                    int modificar = sc.nextInt();
                    modificar -= 1;

                    System.out.println("Que deseas modificar del disco?");
                    System.out.println("1. Codigo");
                    System.out.println("2. Autor");
                    System.out.println("3. Titulo");
                    System.out.println("4. Genero");
                    System.out.println("5. Duracion");
                    int queModificar = sc.nextInt();
                    
                    switch (queModificar) {
                      case 1:
                        System.out.print("Introduce el nuevo codigo: ");
                        disco[modificar].setCodigo(sc.next());
                        break;

                      case 2:
                        System.out.print("Introduce el nuevo codigo: ");
                        disco[modificar].setAutor(sc.next());
                        break;

                      case 3:
                        System.out.print("Introduce el nuevo codigo: ");
                        disco[modificar].setTitulo(sc.next());
                        break;

                      case 4:
                        System.out.print("Introduce el nuevo codigo: ");
                        disco[modificar].setGenero(sc.next());
                        break;

                      case 5:
                        System.out.print("Introduce el nuevo codigo: ");
                        disco[modificar].setDuracion(sc.nextInt());
                        break;
                    
                      default:
                        break;
                    }

                    break;

                case 4:
                    for (int i = 0; i < disco.length-1; i++) {
                      if (disco[i]!=null) {
                        while (disco[i-1] == null) {
                          disco[i-1] = disco[i];
                          disco[i] = null; 
                          // i -= 1;
                        }
                      }
                    }

                    break;

                case 5:
                    for (int i = 0; i < disco.length; i++) {
                        if (disco[i] != null) { // Solo verifica si el disco no es null
                            System.out.println("Disco " + (i + 1) + ": " + disco[i].toString());
                        }
                    }
                    break;

                case 6:
                    salida = true;
                    break;

                default:
                    break;
            }
        } while (!salida);

        sc.close();
    }
}
