package vista;

import modelo.ReservaMesa;
import java.util.List;

public class ViewReservaMesa {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListReservaMesas(List<ReservaMesa> reservas) {
        System.out.println("\n== Reservas de Mesas ==");
        for (ReservaMesa reserva : reservas) {
            System.out.println("ID: " + reserva.getId() +
                               ", Fecha: " + reserva.getFecha() +
                               ", Mesa ID: " + reserva.getMesaId() +
                               ", Cliente: " + reserva.getCliente());
        }
    }
}
