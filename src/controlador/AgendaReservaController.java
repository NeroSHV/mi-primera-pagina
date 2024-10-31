package controlador;

import modelo.AgendaReserva;
import vista.ViewAgendaReserva;
import java.util.List;

public class AgendaReservaController {
    private ViewAgendaReserva view;

    // Constructor
    public AgendaReservaController(ViewAgendaReserva view) {
        this.view = view;
    }

    // Insertar una nueva reserva en la agenda
    public void insertNewAgendaReserva(AgendaReserva agendaReserva) {
        AgendaReserva.insertAgendaReserva(agendaReserva);
        System.out.println("Nueva reserva en la agenda: " + agendaReserva.getId());
    }

    // Mostrar todas las reservas de la agenda en la vista
    public void displayAllAgendaReservas() {
        List<AgendaReserva> reservas = AgendaReserva.getAllAgendaReservas();
        view.displayAgendaReservas(reservas);
    }
}
