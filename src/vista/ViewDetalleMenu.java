package vista;

import modelo.DetalleMenu;
import java.util.List;

public class ViewDetalleMenu {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListDetalleMenus(List<DetalleMenu> detalles) {
        System.out.println("\n== Detalles de Menús ==");
        for (DetalleMenu detalle : detalles) {
            System.out.println("ID: " + detalle.getId() +
                               ", Menú ID: " + detalle.getMenuId() +
                               ", Plato ID: " + detalle.getPlatoId());
        }
    }
}
