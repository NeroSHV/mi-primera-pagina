package vista;

import modelo.MenuMesa;
import java.util.List;

public class ViewMenuMesa {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListMenuMesas(List<MenuMesa> menus) {
        System.out.println("\n== Menús de Mesa ==");
        for (MenuMesa menu : menus) {
            System.out.println("ID: " + menu.getId() +
                               ", Descripción: " + menu.getDescripcion());
        }
    }
}
