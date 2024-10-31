package controlador;

import modelo.EstadoFactura;
import vista.ViewEstadoFactura;
import java.util.List;

public class EstadoFacturaController {
    private ViewEstadoFactura view;

    // Constructor
    public EstadoFacturaController(ViewEstadoFactura view) {
        this.view = view;
    }

    // Insertar un nuevo estado de factura
    public void insertNewEstadoFactura(EstadoFactura estadoFactura) {
        EstadoFactura.insertEstadoFactura(estadoFactura);
        System.out.println("Nuevo estado de factura agregado: " + estadoFactura.getId());
    }

    // Mostrar todos los estados de factura en la vista
    public void displayAllEstadoFacturas() {
        List<EstadoFactura> estados = EstadoFactura.getAllEstadoFacturas();
        view.displayEstadoFacturas(estados);
    }
}
