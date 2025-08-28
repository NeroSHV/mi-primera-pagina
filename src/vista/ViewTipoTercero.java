package vista;

import interfaces.IMostrarMensaje;
import modelo.TipoTercero;
import java.util.List;

public class ViewTipoTercero implements IMostrarMensaje {
    // Método para mostrar la lista de tipos de tercero
    public void displayListTipoTerceros(List<TipoTercero> tipoTerceros) {
        System.out.println(" == Lista de Tipos de Tercero == ");
        for (TipoTercero tipo : tipoTerceros) {
            System.out.println("Id: " + tipo.getId() + ", Descripción: " + tipo.getDescripcion());
        }
    }

    // Implementación del método mostrarMensaje
    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

