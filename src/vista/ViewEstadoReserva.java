package vista;

import interfaces.IMostrarMensaje;
import modelo.EstadoReserva;

import java.util.List;

public class ViewEstadoReserva implements IMostrarMensaje {

    // Mostrar lista de estados de reserva
    public void displayListEstadoReservas(List<EstadoReserva> estados) {
        System.out.println(" == Lista de Estados de Reserva == ");
        for (EstadoReserva estado : estados) {
            // Cambiar getId() por getEstadoReservaId()
            System.out.println("Id: " + estado.getEstadoReservaId() + ", Descripción: " + estado.getDescripcion());
        }
    }

    // Implementación del método mostrarMensaje
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);  // Imprime el mensaje en la consola
    }
}
