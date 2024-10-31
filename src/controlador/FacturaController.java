package controlador;

import modelo.Factura;
import vista.ViewFactura;
import java.util.List;

public class FacturaController {
    private ViewFactura view;

    // Constructor
    public FacturaController(ViewFactura view) {
        this.view = view;
    }

    // Insertar una nueva factura
    public void insertNewFactura(Factura factura) {
        Factura.insertFactura(factura);
        System.out.println("Nueva factura agregada: " + factura.getId());
    }

    // Mostrar todas las facturas en la vista
    public void displayAllFacturas() {
        List<Factura> facturas = Factura.getAllFacturas();
        view.displayFacturas(facturas);
    }
}

