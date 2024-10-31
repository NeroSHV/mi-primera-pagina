package controlador;

import modelo.MenuMesa;
import vista.ViewMenuMesa;
import java.util.List;

public class MenuMesaController {
    private ViewMenuMesa view;

    // Constructor
    public MenuMesaController(ViewMenuMesa view) {
        this.view = view;
    }

    // Insertar un nuevo menú para mesa
    public void insertNewMenuMesa(MenuMesa menuMesa) {
        MenuMesa.insertMenuMesa(menuMesa);
        System.out.println("Nuevo menú para mesa agregado: " + menuMesa.getId());
    }

    // Mostrar todos los menús para mesa en la vista
    public void displayAllMenuMesas() {
        List<MenuMesa> menus = MenuMesa.getAllMenuMesas();
        view.displayMenuMesas(menus);
    }
}
