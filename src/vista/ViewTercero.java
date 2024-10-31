package vista;

import modelo.Tercero;
import java.util.List;

public class ViewTercero {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListTerceros(List<Tercero> terceros) {
        System.out.println("\n== Lista de Terceros ==");
        for (Tercero tercero : terceros) {
            System.out.println("NID: " + tercero.getNid() +
                               ", Nombres: " + tercero.getNombres() +
                               ", Apellidos: " + tercero.getApellidos() +
                               ", Tipo de Tercero ID: " + tercero.getTipoTerceroId());
        }
    }
}
