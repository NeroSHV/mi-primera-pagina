package vista;

import modelo.Municipio;
import java.util.List;

public class ViewMunicipio {

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void displayListMunicipios(List<Municipio> municipios) {
        System.out.println("\n== Lista de Municipios ==");
        for (Municipio municipio : municipios) {
            System.out.println("ID: " + municipio.getId() +
                               ", Nombre: " + municipio.getNombre());
        }
    }
}
