package vista;

import interfaces.IMostrarMensaje;
import modelo.AgendaReserva;

import java.util.List;

public class ViewAgendaReserva implements IMostrarMensaje {
    public void displayListAgendaReservas(List<AgendaReserva> agendaReservas) {
        System.out.println(" == Lista de Agendas de Reserva == ");
        for (AgendaReserva reserva : agendaReservas) {
            System.out.println("Id: " + reserva.getId() + ", Fecha: " + reserva.getFecha() + ", Estado: " + reserva.getEstado());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
