package vista;

import modelo.MenuReservado;
import java.util.List;

public class ViewMenuReservado {
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListMenuReservado(List<MenuReservado> menuReservados) {
        System.out.println("\n== Lista de Menús Reservados ==");
        for (MenuReservado menuReservado : menuReservados) {
            System.out.println("ID: " + menuReservado.getMenuReservadoId() +
                               ", Cantidad: " + menuReservado.getCantidadDeMenus() +
                               ", ID del Menú: " + menuReservado.getMenuId() +
                               ", ID de la Reserva de Mesa: " + menuReservado.getReservaMesaId());
        }
    }
}
