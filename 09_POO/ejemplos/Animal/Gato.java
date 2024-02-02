public class Gato extends Animal {
  private String  raza;

  public Gato (Sexo s, String r) {
    super(s);
    raza = r;
  }

  public Gato(Sexo s) {
    super(s);
    raza = "siames";
  }

  public Gato(String raza) {
    super(Sexo.HEMBRA);
    this.raza = raza;
  }

  

  
  
}
