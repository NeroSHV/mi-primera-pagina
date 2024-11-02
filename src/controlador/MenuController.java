package controlador;

import modelo.Menu;
import vista.ViewMenu;

import java.util.List;

public class MenuController {
    private ViewMenu view;

    public MenuController(ViewMenu view) {
        this.view = view;
    }

    public void insertNewMenu(Menu newMenu) {
        Menu.insertMenu(newMenu);
        view.mostrarMensaje("\nMenú guardado correctamente!");
    }

    public void displayAllMenus() {
        List<Menu> menus = Menu.getAllMenus();
        view.displayListMenus(menus);
    }
}
