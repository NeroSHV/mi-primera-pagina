package controlador;

import modelo.EstadoFactura;
import vista.ViewEstadoFactura;

import java.util.List;

public class EstadoFacturaController {
    private ViewEstadoFactura view;

    public EstadoFacturaController(ViewEstadoFactura view) {
        this.view = view;
    }

    public void insertNewEstadoFactura(EstadoFactura newEstadoFactura) {
        EstadoFactura.insertEstadoFactura(newEstadoFactura);
        view.mostrarMensaje("\nEstado de Factura guardado correctamente!");
    }

    public void displayAllEstadoFacturas() {
        List<EstadoFactura> estados = EstadoFactura.getAllEstadoFacturas();
        view.displayListEstadoFacturas(estados);
    }
}
