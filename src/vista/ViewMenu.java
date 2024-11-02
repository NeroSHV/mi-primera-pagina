package vista;

import interfaces.IMostrarMensaje;
import modelo.Menu;

import java.util.List;

public class ViewMenu implements IMostrarMensaje {
    public void displayListMenus(List<Menu> menus) {
        System.out.println(" == Lista de Menús == ");
        for (Menu menu : menus) {
            System.out.println("Id: " + menu.getId() + ", Nombre: " + menu.getNombre());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
