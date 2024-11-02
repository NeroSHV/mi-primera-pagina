package controlador;

import modelo.MenuMesa;
import vista.ViewMenuMesa;

import java.util.List;

public class MenuMesaController {
    private ViewMenuMesa view;

    public MenuMesaController(ViewMenuMesa view) {
        this.view = view;
    }

    public void insertNewMenuMesa(MenuMesa newMenuMesa) {
        MenuMesa.insertMenuMesa(newMenuMesa);
        view.mostrarMensaje("\nMenú de Mesa guardado correctamente!");
    }

    public void displayAllMenuMesas() {
        List<MenuMesa> menuMesas = MenuMesa.getAllMenuMesas();
        view.displayListMenuMesas(menuMesas);
    }
}
