package vista;

import interfaces.IMostrarMensaje;
import modelo.Mesa;

import java.util.List;

public class ViewMesa implements IMostrarMensaje {
    public void displayListMesas(List<Mesa> mesas) {
        System.out.println(" == Lista de Mesas == ");
        for (Mesa mesa : mesas) {
            System.out.println("Id: " + mesa.getMesaId() + ", Número: " + mesa.getNumeroMesa() + ", Estado: " + mesa.getEstadoMesaId());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
