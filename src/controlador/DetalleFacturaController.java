package controlador;

import modelo.DetalleFactura;
import vista.ViewDetalleFactura;
import java.util.List;

public class DetalleFacturaController {
    private ViewDetalleFactura view;

    // Constructor
    public DetalleFacturaController(ViewDetalleFactura view) {
        this.view = view;
    }

    // Insertar un nuevo detalle de factura
    public void insertNewDetalleFactura(DetalleFactura detalleFactura) {
        DetalleFactura.insertDetalleFactura(detalleFactura);
        System.out.println("Nuevo detalle de factura agregado: " + detalleFactura.getId());
    }

    // Mostrar todos los detalles de factura en la vista
    public void displayAllDetalleFacturas() {
        List<DetalleFactura> detalles = DetalleFactura.getAllDetalleFacturas();
        view.displayDetalleFacturas(detalles);
    }
}
