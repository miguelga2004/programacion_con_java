import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        HashMap<String, String> paisesCapitales = new HashMap<>();
        paisesCapitales.put("España", "Madrid");
        paisesCapitales.put("Francia", "París");
        paisesCapitales.put("Italia", "Roma");
        paisesCapitales.put("Alemania", "Berlín");
        paisesCapitales.put("Portugal", "Lisboa");
        paisesCapitales.put("Rusia", "Moscú");
        paisesCapitales.put("Grecia", "Atenas");
        paisesCapitales.put("Noruega", "Oslo");
        paisesCapitales.put("Suecia", "Estocolmo");
        paisesCapitales.put("Finlandia", "Helsinki");

        ArrayList<String> capitalesIncorrectas = new ArrayList<>();
        capitalesIncorrectas.add("Tirana");
        capitalesIncorrectas.add("Bruselas");
        capitalesIncorrectas.add("Viena");
        capitalesIncorrectas.add("Minsk");
        capitalesIncorrectas.add("Sarajevo");
        capitalesIncorrectas.add("Sofía");
        capitalesIncorrectas.add("Nicosia");
        capitalesIncorrectas.add("Zagreb");
        capitalesIncorrectas.add("Copenhague");
        capitalesIncorrectas.add("Dublín");
        capitalesIncorrectas.add("Reikiavik");
        capitalesIncorrectas.add("Vaduz");
        capitalesIncorrectas.add("Vilna");
        capitalesIncorrectas.add("Luxemburgo");
        capitalesIncorrectas.add("Chisinau");
        capitalesIncorrectas.add("Mónaco");
        capitalesIncorrectas.add("Podgorica");
        capitalesIncorrectas.add("Ámsterdam");
        capitalesIncorrectas.add("Varsovia");
        capitalesIncorrectas.add("Bucarest");

        Collections.shuffle(capitalesIncorrectas); 

        Scanner scanner = new Scanner(System.in);
        int puntuacion = 0;

        //Paso HashMap a Array para poder mezclarlos
        ArrayList<String> paises = new ArrayList<>(paisesCapitales.keySet());
        Collections.shuffle(paises); // Mezclar los países para tener preguntas aleatorias

        for (int i = 0; i < 10; i++) {
            String paisActual = paises.get(i);
            String capitalCorrecta = paisesCapitales.get(paisActual);

            ArrayList<String> opciones = new ArrayList<>();
            opciones.add(capitalCorrecta);

            // Los paises erroneos se mezclan una vez porque los selecciono en orden una vez mezclados
            // El 1 y el 11, el 2 y el 12...etc
            opciones.add(capitalesIncorrectas.get(i)); 
            opciones.add(capitalesIncorrectas.get(i + 10)); 

            Collections.shuffle(opciones);

            System.out.println("¿Cuál es la capital de " + paisActual + "?");
            for (int j = 0; j < opciones.size(); j++) {
                System.out.println((j + 1) + ". " + opciones.get(j));
            }

            System.out.print("Respuesta: ");
            int respuesta = scanner.nextInt();

            if (opciones.get(respuesta - 1).equals(capitalCorrecta)) {
                System.out.println("Correcto!");
               puntuacion++;

            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + capitalCorrecta);
            }
            System.out.println();
        }
        
        System.out.println("Puntuacion: " + puntuacion);
        if (puntuacion >= 5) {
            System.out.println("Enhorabuena! Has aprobado!");
        } else {
            System.out.println("Lo siento. Has suspendido.");
        }
    }
}
