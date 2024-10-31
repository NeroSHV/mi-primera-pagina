package vista;

import modelo.EstadoFactura;
import java.util.List;

public class ViewEstadoFactura {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListEstadoFacturas(List<EstadoFactura> estados) {
        System.out.println("\n== Estados de Facturas ==");
        for (EstadoFactura estado : estados) {
            System.out.println("ID: " + estado.getId() +
                               ", Estado: " + estado.getEstado());
        }
    }
}
