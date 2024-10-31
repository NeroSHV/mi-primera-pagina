package vista;

import modelo.EstadoMesa;
import java.util.List;

public class ViewEstadoMesa {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListEstadoMesas(List<EstadoMesa> estados) {
        System.out.println("\n== Estados de Mesas ==");
        for (EstadoMesa estado : estados) {
            System.out.println("ID: " + estado.getId() +
                               ", Estado: " + estado.getEstado());
        }
    }
}
