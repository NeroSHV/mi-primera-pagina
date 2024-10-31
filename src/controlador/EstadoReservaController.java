package controlador;

import modelo.EstadoReserva;
import vista.ViewEstadoReserva;
import java.util.List;

public class EstadoReservaController {
    private ViewEstadoReserva view;

    // Constructor
    public EstadoReservaController(ViewEstadoReserva view) {
        this.view = view;
    }

    // Insertar un nuevo estado de reserva
    public void insertNewEstadoReserva(EstadoReserva estadoReserva) {
        EstadoReserva.insertEstadoReserva(estadoReserva);
        System.out.println("Nuevo estado de reserva agregado: " + estadoReserva.getId());
    }

    // Mostrar todos los estados de reserva en la vista
    public void displayAllEstadoReservas() {
        List<EstadoReserva> estados = EstadoReserva.getAllEstadoReservas();
        view.displayEstadoReservas(estados);
    }
}
