/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
import java.util.Scanner;
public class T05Histograma {
    public static void main(String[] args) {
        //No es la forma mas eficiente pero es la que he conseguido
        Scanner sc = new Scanner(System.in);
        int num=0;
        int cantNum = 0;
        int copia = 0;
        int numCompleto = 0;
        int mult = 1;
        int resto = 10;
        int divisor = 1;
        //Pedidos el caracter con el que queremos completar la tabla
        System.out.println("Introduce con que caracter quieres que se complete la tabla: ");
        String caracter = sc.nextLine();

        System.out.println("Introduzca numeros entre 0 y 9. Si desea parar introduzca numero negativo");
        //Pedidos los numeros y los vamos almacenando dentro de la tabla
        while ((num>=0)&&(num<10)) {

            num = sc.nextInt();
            cantNum ++;
            copia = num;
            //Almacenamos los numeros en COPIA, tambien vamos contando la cantidad de numeros introducidos
            if ((copia>=0)&&(copia<10)) {
                copia *= mult;
                mult *= 10;
                numCompleto = numCompleto + copia;
                //En este if, convertimos todos los numeros introducidos en un solo gran numero.
            }
        }

        for (int i = 0; i < (cantNum-1); i++) {
            //En este bucle vamos a divir los numeros para mostrarlos de manera independiente y en el orden que se introdujeron.
            int digito = ((numCompleto%resto)/divisor);
            System.out.println(" --- --- --- --- --- --- --- --- --- ---");
            System.out.print("| " + digito + " |");
            
                //Este primer bucle nos permirte imprimir cajas que contencan el caracter introducido hasta el tamaño del numero
                for (int j = 0; j < digito; j++) {
                    System.out.print(" " + caracter + " |");
                }

                //Aqui calculamos cuantas cajas harian falta para llegara 9, y hacemos un blucle que imprima las cajas vacias necesarias hasta llegar a 9.
                int huecos = 9 - digito;
                for (int j = 0; j < huecos; j++) {
                    System.out.print("   |");
                }

                System.out.println( "");
            //Esto permite que en cada iteracion el bucle calcule un digito diferente del numero.
            resto *= 10;
            divisor *= 10;
        }
        sc.close();
    }
}
