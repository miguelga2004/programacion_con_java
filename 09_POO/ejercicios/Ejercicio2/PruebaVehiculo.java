public class PruebaVehiculo {
  public static void main(String[] args) {
    Coche toyota = new Coche("2344FDF", "Toyota", "Prius");
    Bicicleta bh = new Bicicleta("bh");
    int opcion = 0;
    int km = 0;

    while (opcion!=8) {
      System.out.println("VEHÍCULOS\r\n" + //
            "=========\r\n" + //
            "1. Anda con la bicicleta\r\n" + //
            "2. Haz el caballito con la bicicleta\r\n" + //
            "3. Anda con el coche\r\n" + //
            "4. Quema rueda con el coche\r\n" + //
            "5. Ver kilometraje de la bicicleta\r\n" + //
            "6. Ver kilometraje del coche\r\n" + //
            "7. Ver kilometraje total\r\n" + //
            "8. Salir\r\n" + //
            "Elige una opción (1-8):\r");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
              case 1:
                System.out.println("Cuantos kilometros");
                km = Integer.parseInt(System.console().readLine());
                bh.recorre(km);
                break;

              case 5:
                System.out.println(bh.getKilometrosRecorridos());
                break;

              case 6:
                System.out.println(toyota.getKilometrosRecorridos());
                break;

              case 7:
                System.out.println(Vehiculo.getKilometroTotales());
                break;
            
              default:
                break;
            }
            
    }
    
    
  }
}
