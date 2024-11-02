package vista;

import interfaces.IMostrarMensaje;
import modelo.Factura;

import java.util.List;

public class ViewFactura implements IMostrarMensaje {
    public void displayListFacturas(List<Factura> facturas) {
        System.out.println(" == Lista de Facturas == ");
        for (Factura factura : facturas) {
            System.out.println("Id: " + factura.getId() + ", Total: " + factura.getTotal());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
