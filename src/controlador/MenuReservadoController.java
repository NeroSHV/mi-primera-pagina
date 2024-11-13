package controlador;

import modelo.MenuReservado;
import vista.ViewMenuReservado;
import java.util.List;

public class MenuReservadoController {
    private ViewMenuReservado view;

    public MenuReservadoController(ViewMenuReservado view) {
        this.view = view;
    }

    public void insertNewMenuReservado(MenuReservado menuReservado) {
        MenuReservado.insertMenuReservado(menuReservado);
        view.mostrarMensaje("\nNuevo menú reservado agregado: " + menuReservado.getMenuReservadoId());
    }

    public void displayAllMenuReservados() {
        List<MenuReservado> menuReservados = MenuReservado.getAllMenuReservados();
        view.displayListMenuReservado(menuReservados);
    }

    public void mostrarMenuReservado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMenuReservado'");
    }
}
