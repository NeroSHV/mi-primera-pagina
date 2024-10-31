package vista;

import modelo.TipoTercero;
import java.util.List;

public class ViewTipoTercero {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListTipoTerceros(List<TipoTercero> tipos) {
        System.out.println("\n== Tipos de Tercero ==");
        for (TipoTercero tipo : tipos) {
            System.out.println("ID: " + tipo.getId() +
                               ", Descripción: " + tipo.getDescripcion());
        }
    }
}
