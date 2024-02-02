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

  public Gato(String r) {
    super(Sexo.HEMBRA);
    raza = r;
  }

  public Gato(){
    super(Sexo.HEMBRA);
    raza = "siamés";
  }

  public String toString() {
    return super.toString() + "Raza: " + this.raza + "\n************";
  }

  public void maullar() {
    System.out.println("Miauuuuu");
  }
  
  public void ronronea() {
    System.out.println("mrrrrrrr");
  }

  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  public void peleaCon(Gato contrincante) {
    if (this.getSexo() == Sexo.HEMBRA) {
      System.out.println("No me gusta pelear");
    } else {
      if (contrincante.getSexo() == Sexo.HEMBRA) {
        System.out.println("no me gusta pelear");
      } else {
        System.out.println("ven aqui que te vas a enterar");
      }      
    }
  }

  
  
}
