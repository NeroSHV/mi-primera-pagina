package vista;

import interfaces.IMostrarMensaje;
import modelo.TipoPlato;

import java.util.List;

public class ViewTipoPlato implements IMostrarMensaje {
    public void displayListTipoPlatos(List<TipoPlato> tipos) {
        System.out.println(" == Lista de Tipos de Plato == ");
        for (TipoPlato tipo : tipos) {
            System.out.println("Id: " + tipo.getId() + ", Descripción: " + tipo.getDescripcion());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
