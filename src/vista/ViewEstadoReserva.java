package vista;

import interfaces.IMostrarMensaje;
import modelo.EstadoReserva;

import java.util.List;

public class ViewEstadoReserva implements IMostrarMensaje {
    public void displayListEstadoReservas(List<EstadoReserva> estados) {
        System.out.println(" == Lista de Estados de Reserva == ");
        for (EstadoReserva estado : estados) {
            System.out.println("Id: " + estado.getId() + ", Descripción: " + estado.getDescripcion());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
