package vista;

import interfaces.IMostrarMensaje;
import modelo.EstadoFactura;

import java.util.List;

public class ViewEstadoFactura implements IMostrarMensaje {
    public void displayListEstadoFacturas(List<EstadoFactura> estados) {
        System.out.println(" == Lista de Estados de Factura == ");
        for (EstadoFactura estado : estados) {
            System.out.println("Id: " + estado.getId() + ", Descripción: " + estado.getDescripcion());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
