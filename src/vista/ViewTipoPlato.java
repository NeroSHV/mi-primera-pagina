package vista;

import modelo.TipoPlato;
import java.util.List;

public class ViewTipoPlato {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListTipoPlatos(List<TipoPlato> tipos) {
        System.out.println("\n== Tipos de Platos ==");
        for (TipoPlato tipo : tipos) {
            System.out.println("ID: " + tipo.getId() +
                               ", Descripción: " + tipo.getDescripcion());
        }
    }
}
