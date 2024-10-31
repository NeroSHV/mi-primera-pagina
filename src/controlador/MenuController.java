package controlador;

import modelo.Menu;
import vista.ViewMenu;
import java.util.List;

public class MenuController {
    private ViewMenu view;

    // Constructor
    public MenuController(ViewMenu view) {
        this.view = view;
    }

    // Insertar un nuevo menú
    public void insertNewMenu(Menu menu) {
        Menu.insertMenu(menu);
        System.out.println("Nuevo menú agregado: " + menu.getId());
    }

    // Mostrar todos los menús en la vista
    public void displayAllMenus() {
        List<Menu> menus = Menu.getAllMenus();
        view.displayMenus(menus);
    }
}
