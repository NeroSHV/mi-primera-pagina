package vista;

import modelo.Factura;
import java.util.List;

public class ViewFactura {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListFacturas(List<Factura> facturas) {
        System.out.println("\n== Lista de Facturas ==");
        for (Factura factura : facturas) {
            System.out.println("ID: " + factura.getId() +
                               ", Fecha: " + factura.getFecha() +
                               ", Total: " + factura.getTotal());
        }
    }
}
