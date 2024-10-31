package vista;

import modelo.Menu;
import java.util.List;

public class ViewMenu {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListMenus(List<Menu> menus) {
        System.out.println("\n== Menús ==");
        for (Menu menu : menus) {
            System.out.println("ID: " + menu.getId() +
                               ", Descripción: " + menu.getDescripcion());
        }
    }
}
