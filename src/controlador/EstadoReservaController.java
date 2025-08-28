package controlador;

import modelo.EstadoReserva;
import vista.ViewEstadoReserva;
import java.util.List;

public class EstadoReservaController {
    private ViewEstadoReserva view;

    public EstadoReservaController(ViewEstadoReserva view) {
        this.view = view;
    }

    public void insertNewEstadoReserva(EstadoReserva newEstadoReserva) {
        EstadoReserva.insertEstadoReserva(newEstadoReserva);
        view.mostrarMensaje("\nEstado de Reserva guardado correctamente!");
    }

    public void displayAllEstadoReservas() {
        List<EstadoReserva> estados = EstadoReserva.getAllEstadoReservas();
        view.displayListEstadoReservas(estados);
    }

    public void cambiarEstadoReserva(EstadoReserva estadoReserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarEstadoReserva'");
    }
}
