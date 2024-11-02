package vista;

import interfaces.IMostrarMensaje;
import modelo.EstadoMesa;

import java.util.List;

public class ViewEstadoMesa implements IMostrarMensaje {
    public void displayListEstadoMesas(List<EstadoMesa> estados) {
        System.out.println(" == Lista de Estados de Mesa == ");
        for (EstadoMesa estado : estados) {
            System.out.println("Id: " + estado.getId() + ", Descripción: " + estado.getDescripcion());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
