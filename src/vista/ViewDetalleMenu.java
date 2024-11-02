package vista;

import interfaces.IMostrarMensaje;
import modelo.DetalleMenu;

import java.util.List;

public class ViewDetalleMenu implements IMostrarMensaje {
    public void displayListDetalleMenus(List<DetalleMenu> detalleMenus) {
        System.out.println(" == Lista de Detalles de Menú == ");
        for (DetalleMenu detalle : detalleMenus) {
            System.out.println("Id: " + detalle.getId() + ", Plato ID: " + detalle.getPlatoId() + ", Cantidad: " + detalle.getCantidad());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
