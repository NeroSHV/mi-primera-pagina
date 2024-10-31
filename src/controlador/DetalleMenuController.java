package controlador;

import modelo.DetalleMenu;
import vista.ViewDetalleMenu;
import java.util.List;

public class DetalleMenuController {
    private ViewDetalleMenu view;

    // Constructor
    public DetalleMenuController(ViewDetalleMenu view) {
        this.view = view;
    }

    // Insertar un nuevo detalle de menú
    public void insertNewDetalleMenu(DetalleMenu detalleMenu) {
        DetalleMenu.insertDetalleMenu(detalleMenu);
        System.out.println("Nuevo detalle de menú agregado: " + detalleMenu.getId());
    }

    // Mostrar todos los detalles de menú en la vista
    public void displayAllDetalleMenus() {
        List<DetalleMenu> detalles = DetalleMenu.getAllDetalleMenus();
        view.displayDetalleMenus(detalles);
    }
}
