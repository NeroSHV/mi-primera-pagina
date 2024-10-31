package vista;

import modelo.EstadoReserva;
import java.util.List;

public class ViewEstadoReserva {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListEstadoReservas(List<EstadoReserva> estados) {
        System.out.println("\n== Estados de Reservas ==");
        for (EstadoReserva estado : estados) {
            System.out.println("ID: " + estado.getId() +
                               ", Estado: " + estado.getEstado());
        }
    }
}
