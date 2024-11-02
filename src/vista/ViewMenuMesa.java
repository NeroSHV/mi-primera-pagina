package vista;

import interfaces.IMostrarMensaje;
import modelo.MenuMesa;

import java.util.List;

public class ViewMenuMesa implements IMostrarMensaje {
    public void displayListMenuMesas(List<MenuMesa> menuMesas) {
        System.out.println(" == Lista de Menús de Mesa == ");
        for (MenuMesa menuMesa : menuMesas) {
            System.out.println("Id: " + menuMesa.getId() + ", Nombre: " + menuMesa.getNombre());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
