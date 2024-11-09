package controlador;

import modelo.MenuReservado;
import vista.ViewMenuReservado;
import java.util.List;

public class MenuReservadoController {
    private ViewMenuReservado view;

    // Constructor
    public MenuReservadoController(ViewMenuReservado view) {
        this.view = view;
    }

    // Insertar un nuevo menú reservado
    public void insertNewMenuReservado(MenuReservado menuReservado) {
        MenuReservado.insertMenuReservado(menuReservado);
        view.mostrarMensaje("\nNuevo menú reservado agregado: " + menuReservado.getMenuReservadoId());
    }

    // Mostrar todos los menús reservados en la vista
    public void displayAllMenuReservados() {
        List<MenuReservado> menuReservados = MenuReservado.getAllMenuReservados();
        view.displayListMenuReservado(menuReservados);
    }
}
