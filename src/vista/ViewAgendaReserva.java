package vista;

import modelo.AgendaReserva;
import java.util.List;

public class ViewAgendaReserva {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListAgendaReservas(List<AgendaReserva> reservas) {
        System.out.println("\n== Lista de Reservas en la Agenda ==");
        for (AgendaReserva reserva : reservas) {
            System.out.println("ID: " + reserva.getId() +
                               ", Fecha: " + reserva.getFecha() +
                               ", NID: " + reserva.getNid());
        }
    }
}
