package vista;

import interfaces.IMostrarMensaje;
import modelo.TipoTercero;

import java.util.List;

public class ViewTipoTercero implements IMostrarMensaje {
    public void displayListTipoTerceros(List<TipoTercero> tipoTerceros) {
        System.out.println(" == Lista de Tipos de Tercero == ");
        for (TipoTercero tipo : tipoTerceros) {
            System.out.println("Id: " + tipo.getId() + ", Descripción: " + tipo.getDescripcion());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
