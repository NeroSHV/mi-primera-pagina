package vista;

import interfaces.IMostrarMensaje;
import modelo.Tercero;

import java.util.List;

public class ViewTercero implements IMostrarMensaje {
    public void displayListTerceros(List<Tercero> terceros) {
        System.out.println(" == Lista de Terceros == ");
        for (Tercero tercero : terceros) {
            System.out.println("Id: " + tercero.getNid() + ", Nombre: " + tercero.getNombres() + ", Tipo ID: " + tercero.getTipoTerceroId());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
