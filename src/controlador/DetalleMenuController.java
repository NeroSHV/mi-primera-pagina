package controlador;

import modelo.DetalleMenu;
import vista.ViewDetalleMenu;

import java.util.List;

public class DetalleMenuController {
    private ViewDetalleMenu view;

    public DetalleMenuController(ViewDetalleMenu view) {
        this.view = view;
    }

    public void insertNewDetalleMenu(DetalleMenu newDetalleMenu) {
        DetalleMenu.insertDetalleMenu(newDetalleMenu);
        view.mostrarMensaje("\nDetalle de Menú guardado correctamente!");
    }

    public void displayAllDetalleMenus() {
        List<DetalleMenu> detalleMenus = DetalleMenu.getAllDetalleMenus();
        view.displayListDetalleMenus(detalleMenus);
    }
}

