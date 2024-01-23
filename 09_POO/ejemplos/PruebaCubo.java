public class PruebaCubo {
  public static void main(String[] args) {
    Cubo cubo = new Cubo(10);
    cubo.setContenido(6);
    cubo.pinta();

    Cubo cuboDestino = new Cubo(15);
    cuboDestino.setContenido(1);
    cubo.vuelcaEn(cuboDestino);

    cubo.pinta();
    cuboDestino.pinta();
    
    System.out.println(cubo.toString());
    System.out.println(cuboDestino.toString());
    
    
  }
}
