package vista;

import modelo.Plato;
import java.util.List;

public class ViewPlato {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListPlatos(List<Plato> platos) {
        System.out.println("\n== Lista de Platos ==");
        for (Plato plato : platos) {
            System.out.println("ID: " + plato.getId() +
                               ", Nombre: " + plato.getNombre() +
                               ", Precio: " + plato.getPrecio());
        }
    }
}
