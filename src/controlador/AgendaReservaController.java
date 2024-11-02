package controlador;

import modelo.AgendaReserva;
import vista.ViewAgendaReserva;

import java.util.List;

public class AgendaReservaController {
    private ViewAgendaReserva view;

    public AgendaReservaController(ViewAgendaReserva view) {
        this.view = view;
    }

    public void insertNewAgendaReserva(AgendaReserva newAgendaReserva) {
        AgendaReserva.insertAgendaReserva(newAgendaReserva);
        view.mostrarMensaje("\nAgenda de Reserva guardada correctamente!");
    }

    public void displayAllAgendaReservas() {
        List<AgendaReserva> agendaReservas = AgendaReserva.getAllAgendaReservas();
        view.displayListAgendaReservas(agendaReservas);
    }
}
