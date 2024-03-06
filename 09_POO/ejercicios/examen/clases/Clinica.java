// package clases;
/**
 * Explica tu codigo aqui
 * @author Miguel Garcia
 */

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Mascota> listado = new ArrayList<>();

    public boolean esVacia() {
        return listado.isEmpty();
    }

    public boolean esLlena() {
        return listado.size() >= 100;
    }

    public void agregar(Mascota mascota) {
        if (!esLlena()) {
            listado.add(mascota);
        }
    }

    public Mascota buscarChip(String chip) {
        for (Mascota mascota : listado) {
            if (mascota.getChip().equals(chip)) {
                return mascota;
            }
        }
        return null;
    }

    public void listar() {
        for (Mascota mascota : listado) {
            System.out.println("[" + mascota.getChip() + "]: " + mascota.getNombre() + ", " + mascota.getEdad() + " años");
        }
    }

    public int totalPerros() {
        return Perro.getTotalPerros();
    }

    public int totalGatos() {
        return Gato.getTotalGatos();
    }

    public int totalMascotas() {
        return listado.size();
    }
}
