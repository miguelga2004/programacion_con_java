// Perro.java
/**

 * @author Miguel Garcia
 */
public class Perro extends Mascota {
    private String raza; // Atributo para almacenar la raza del perro.
    private static int totalPerros = 0; // Contador estático para el total de instancias de Perro.

    public Perro(String chip) {
        super(chip, "Desconocido", 0);
        totalPerros++;
    }

    // Constructor que recibe el chip y el nomre, estableciendo la edad por defecto.
    public Perro(String chip, String nombre) {
        super(chip, nombre, 0);
        totalPerros++;
    }

    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    public void grunir() {
        System.out.println("Grrrrr….");
    }

    @Override
    public void pasear() {
        if (!this.getVacunada()) { // Si el perro no está vacunado, no puede pasear.
            System.out.println(this.getNombre() + " no puede pasear hasta no estar vacunado/a");
        } else {
            // Si el perro está vacunado, ladra al pasear.
            ladrar();
        }
    }

    @Override
    public void vacunar() {
        if (this.getVacunada()) {
            System.out.println(this.getNombre() + " ya se encuentra vacunado/a");
        } else {
            super.vacunar(); // Llama al método vacunar de la clase base para cambiar el estado de vacunación.
            grunir(); // El perro gruñe al ser vacunado.
        }
    }

    public static int getTotalPerros() {
        return totalPerros;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
