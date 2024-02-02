public class CuentaCorriente {
  private String numero = "";
  private double saldo;

  public CuentaCorriente (){
    generarAleatorio();
  }

  public CuentaCorriente (double saldoInicial){
    String[] cuentasCreadas = new String[];
    if (generarAleatorio()==) {
      
    }
    generarAleatorio(); 
    this.saldo = saldoInicial;
  }

  private void generarAleatorio(){
    for (int i = 0; i < 3; i++) {
      numero += (int)(Math.random()*10);
    }
  }


  public void ingreso(double cantidad){
    this.saldo += cantidad;
  }

  public void cargo(double cantidad){
    this.saldo -= cantidad;
  }

  public void transferencia(CuentaCorriente destino, double cantidad){
    destino.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return String.format("Número de cta: " + numero + " Saldo: %.2f€", saldo);
  }

}
