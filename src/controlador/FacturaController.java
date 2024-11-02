package controlador;

import modelo.Factura;
import vista.ViewFactura;

import java.util.List;

public class FacturaController {
    private ViewFactura view;

    public FacturaController(ViewFactura view) {
        this.view = view;
    }

    public void insertNewFactura(Factura newFactura) {
        Factura.insertFactura(newFactura);
        view.mostrarMensaje("\nFactura guardada correctamente!");
    }

    public void displayAllFacturas() {
        List<Factura> facturas = Factura.getAllFacturas();
        view.displayListFacturas(facturas);
    }
}
