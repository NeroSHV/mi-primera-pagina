package vista;

import modelo.DetalleFactura;
import java.util.List;

public class ViewDetalleFactura {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListDetalleFacturas(List<DetalleFactura> detalles) {
        System.out.println("\n== Detalles de Facturas ==");
        for (DetalleFactura detalle : detalles) {
            System.out.println("ID: " + detalle.getId() +
                               ", Factura ID: " + detalle.getFacturaID() +
                               ", Plato ID: " + detalle.getPlatoID() +
                               ", Cantidad: " + detalle.getCantidad());
        }
    }
}
