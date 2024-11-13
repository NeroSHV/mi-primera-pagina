package controlador;

import modelo.DetalleFactura;
import vista.ViewDetalleFactura;
import java.util.List;

public class DetalleFacturaController {
    private ViewDetalleFactura view;

    public DetalleFacturaController(ViewDetalleFactura view) {
        this.view = view;
    }

    public void insertNewDetalleFactura(DetalleFactura newDetalleFactura) {
        DetalleFactura.insertDetalleFactura(newDetalleFactura);
        view.mostrarMensaje("\nDetalle de Factura guardado correctamente!");
    }

    public void displayAllDetalleFacturas() {
        List<DetalleFactura> detalleFacturas = DetalleFactura.getAllDetalleFacturas();
        view.displayListDetalleFacturas(detalleFacturas);
    }
}
