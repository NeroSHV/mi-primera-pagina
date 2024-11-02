package vista;

import interfaces.IMostrarMensaje;
import modelo.Municipio;

import java.util.List;

public class ViewMunicipio implements IMostrarMensaje {
    public void displayListMunicipios(List<Municipio> municipios) {
        System.out.println(" == Lista de Municipios == ");
        for (Municipio municipio : municipios) {
            System.out.println("Id: " + municipio.getId() + ", Nombre: " + municipio.getNombre());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
