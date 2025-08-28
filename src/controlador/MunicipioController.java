
package controlador;

import modelo.Municipio;
import vista.ViewMunicipio;

import java.util.List;

public class MunicipioController {
    private ViewMunicipio view;

    public MunicipioController(ViewMunicipio view) {
        this.view = view;
    }

    public void insertNewMunicipio(Municipio newMunicipio) {
        Municipio.insertMunicipio(newMunicipio);
        view.mostrarMensaje("\nMunicipio guardado correctamente!");
    }

    public void displayAllMunicipios() {
        List<Municipio> municipios = Municipio.getAllMunicipios();
        view.displayListMunicipios(municipios);
    }
}
