package vista;

import interfaces.IMostrarMensaje;
import modelo.DetalleFactura;

import java.util.List;

public class ViewDetalleFactura implements IMostrarMensaje {
    public void displayListDetalleFacturas(List<DetalleFactura> detalles) {
        System.out.println(" == Lista de Detalles de Factura == ");
        for (DetalleFactura detalle : detalles) {
            System.out.println("Id: " + detalle.getId() + ", Plato ID: " + detalle.getPlatoId() + ", Precio: " + detalle.getPrecio());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
