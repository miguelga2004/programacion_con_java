 abstract class Animal {
  private Sexo sexo;

  public Animal () {
    sexo = Sexo.MACHO;
  }

  public Animal(Sexo s) {
    sexo = s; 
  }

  public Sexo getSexo() {
    return sexo;
  }

  @Override
  public String toString() {
    return "Animal [sexo=" + this.sexo + "]";
  }

  public void duerme() {
    System.out.println("Zzzzzzzzz");
  }
  

}
