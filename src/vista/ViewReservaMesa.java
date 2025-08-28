package vista;

import interfaces.IMostrarMensaje;
import modelo.ReservaMesa;

import java.util.List;

public class ViewReservaMesa implements IMostrarMensaje {
    public void displayListReservaMesas(List<ReservaMesa> reservaMesas) {
        System.out.println(" == Lista de Reservas de Mesa == ");
        for (ReservaMesa reserva : reservaMesas) {
            System.out.println("Id: " + reserva.getMesaId() + ", Mesa ID: " + reserva.getMesaId() + ", Fecha: " + reserva.getFecha());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
