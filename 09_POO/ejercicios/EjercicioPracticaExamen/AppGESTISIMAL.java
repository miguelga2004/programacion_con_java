import java.util.Scanner;

public class AppGESTISIMAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gestisimal[] articulos = new Gestisimal[100];
        boolean salir = false;

        // Demostración: Artículos iniciales
        articulos[0] = new Gestisimal(234, "Bicicleta de montaña", 100, 250, 1);
        articulos[1] = new Gestisimal(543, "Bicicleta de carretera", 234, 400, 4);
        articulos[2] = new Gestisimal(234, "Bicicleta de nieve", 300, 600, 2);

        do {
            System.out.println("Bienvenido a GESTISIMAL: ");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificacion");
            System.out.println("5. Entrada de mercancia");
            System.out.println("6. Salida de mercancia");
            System.out.println("7. Salir");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1: // Listado
                    for (int i = 0; i < articulos.length; i++) {
                        if (articulos[i] != null) {
                            System.out.println("Articulo " + (i + 1) + ": " + articulos[i]);
                        }
                    }
                    break;

                case 2: // Alta
                    System.out.println("Introduciendo nuevo articulo.");
                    System.out.print("Codigo: ");
                    int codigo = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("Descripcion: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Precio de compra: ");
                    float precioCompra = sc.nextFloat();
                    System.out.print("Precio de venta: ");
                    float precioVenta = sc.nextFloat();
                    System.out.print("Numero de unidades (stock): ");
                    int nUnidades = sc.nextInt();

                    // Encontrar el primer índice vacío
                    int i = 0;
                    while (i < articulos.length && articulos[i] != null) {
                        i++;
                    }
                    if (i < articulos.length) {
                        articulos[i] = new Gestisimal(codigo, descripcion, precioCompra, precioVenta, nUnidades);
                        System.out.println("Articulo añadido.");
                    } else {
                        System.out.println("Almacen lleno, no se pueden añadir mas articulos.");
                    }
                    break;

                case 3: // Baja
                    System.out.print("Introduzca el código del artículo a eliminar: ");
                    int codigoBaja = sc.nextInt();
                    boolean encontrado = false;
                    for (int j = 0; j < articulos.length && !encontrado; j++) {
                        if (articulos[j] != null && articulos[j].getCodigo() == codigoBaja) {
                            articulos[j] = null;
                            encontrado = true;
                            System.out.println("Artículo eliminado.");
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 4: // Modificación
                    System.out.print("Introduzca el código del artículo a modificar: ");
                    int codigoMod = sc.nextInt();
                    boolean modificado = false;
                    for (int j = 0; j < articulos.length && !modificado; j++) {
                        if (articulos[j] != null && articulos[j].getCodigo() == codigoMod) {
                            System.out.print("Nueva descripción: ");
                            sc.nextLine(); // Consumir el salto de línea
                            articulos[j].setDescripcion(sc.nextLine());
                            System.out.print("Nuevo precio de compra: ");
                            articulos[j].setPrecioCompra(sc.nextFloat());
                            System.out.print("Nuevo precio de venta: ");
                            articulos[j].setPrecioVenta(sc.nextFloat());
                            System.out.print("Nuevo stock: ");
                            articulos[j].setnUnidades(sc.nextInt());
                            modificado = true;
                            System.out.println("Artículo modificado.");
                        }
                    }
                    if (!modificado) {
                        System.out.println("Artículo no encontrado.");
                    }
                    break;

                case 5: // Entrada de mercancía
                    System.out.print("Introduzca el código del artículo: ");
                    int codigoEntrada = sc.nextInt();
                    System.out.print("Cantidad a incrementar: ");
                    int cantidadEntrada = sc.nextInt();
                    for (Gestisimal articulo : articulos) {
                        if (articulo != null && articulo.getCodigo() == codigoEntrada) {
                            articulo.setnUnidades(articulo.getnUnidades() + cantidadEntrada);
                            System.out.println("Stock actualizado.");
                            break;
                        }
                    }
                    break;

                case 6: // Salida de mercancía
                    System.out.print("Introduzca el código del artículo: ");
                    int codigoSalida = sc.nextInt();
                    System.out.print("Cantidad a decrementar: ");
                    int cantidadSalida = sc.nextInt();
                    for (Gestisimal articulo : articulos) {
                        if (articulo != null && articulo.getCodigo() == codigoSalida) {
                            if (articulo.getnUnidades() >= cantidadSalida) {
                                articulo.setnUnidades(articulo.getnUnidades() - cantidadSalida);
                                System.out.println("Stock actualizado.");
                            } else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        }
                    }
                    break;

                case 7: // Salir
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (!salir);

        sc.close();
    }
}
