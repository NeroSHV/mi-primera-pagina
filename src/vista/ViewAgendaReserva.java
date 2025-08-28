package vista;

import interfaces.IMostrarMensaje;
import modelo.AgendaReserva;

import java.util.List;

public class ViewAgendaReserva implements IMostrarMensaje {

    // Método para mostrar la lista de agendas de reserva
    public void displayListAgendaReservas(List<AgendaReserva> agendaReservas) {
        System.out.println(" == Lista de Agendas de Reserva == ");
        for (AgendaReserva reserva : agendaReservas) {
            System.out.println("Id: " + reserva.getId() +
                               "\nFecha: " + reserva.getFechaReserva() +
                               "\nEstado: " + reserva.getEstadoReservaId());
            System.out.println("-------------------------------------");  // Línea separadora para mejor legibilidad
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // Implementación básica para mostrar el mensaje
        System.out.println("Mensaje: " + mensaje);
    }
}
