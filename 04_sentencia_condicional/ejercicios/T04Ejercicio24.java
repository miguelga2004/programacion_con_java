/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */
 import java.util.Scanner;
 public class T04Ejercicio24 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("1 - Programador junior");
  System.out.println("2 - Prog. senior");
  System.out.println("3 - Jefe de proyecto");

  System.out.print("Introduzca el cargo del empleado (1 - 3): ");
  int cargo = sc.nextInt();

  System.out.print("Cuantos dias ha estado de viaje visitando clientes: ");
  int dias = sc.nextInt();

  System.out.print("Introduzca su estado civil (1 - Soltero, 2 . Casado): ");
  int estCivil = sc.nextInt();

  double sueldoBase = 0;

  double IRPF = 0;

  switch (cargo) {
    case 1:
      sueldoBase = 950;
      break;

    case 2:
      sueldoBase = 1200;
      
      break;

    case 3:
      sueldoBase = 1600;
      break;
  
    default:
      System.out.println("El valor introducido es erroneo");
      break;
  }

  if (estCivil==1) {
    IRPF = 0.25;
  } else if (estCivil==2) {
    IRPF = 0.20;
  }

  
  double sueldoBruto = (sueldoBase+(dias*30));
  double retencionIRPF = (sueldoBruto*IRPF);
  double sueldoNeto = (sueldoBruto-retencionIRPF);

  // System.out.printf("%8s", "------------------------------\n");
  // System.out.printf("%8s Dietas ( %d viajes ) %d %-30s\n","|", dias, (dias*30), "|");
  // System.out.printf("%8s", "|----------------------------|\n");
  // System.out.printf("%8s Sueldo bruto %.2f %-30s\n", "|", sueldoBruto, "|");
  // System.out.printf("%8s Retencion IRPF (%.0f%%) %.2f %-30s\n", "|", (IRPF*20), retencionIRPF, "|");
  // System.out.printf("%8s", "|----------------------------|\n");
  // System.out.printf("%8s Sueldo neto %.2f %-30s\n", "|", sueldoNeto, "|");
  // System.out.printf("%8s", "------------------------------\n");

  System.out.printf("%-8s", "------------------------------\n");
System.out.printf("|%1sDietas ( %d viajes ) %6d %s\n", "", dias, (dias * 30), "|");
System.out.printf("|----------------------------|\n");
System.out.printf("|%1s %-17s %6.2f %s\n", "", "Sueldo bruto", sueldoNeto, "|");
System.out.printf("|%1sRetencion IRPF (%.0f%%) %6.2f %s\n", "", (IRPF * 20), retencionIRPF, "|");
System.out.printf("|----------------------------|\n");
System.out.printf("|%1s %-17s %6.2f %s\n", "", "Sueldo neto", sueldoNeto, "|");
System.out.printf("------------------------------\n");





  // System.out.println(sueldoBase);
  // System.out.println(dias*30);
  // System.out.println(sueldoBruto);
  // System.out.println(retencionIRPF);
  // System.out.println(sueldoBruto-retencionIRPF);

  sc.close();    
  }
}