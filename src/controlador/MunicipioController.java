package controlador;

import modelo.Municipio;
import vista.ViewMunicipio;
import java.util.List;

public class MunicipioController {
    private ViewMunicipio view;

    // Constructor
    public MunicipioController(ViewMunicipio view) {
        this.view = view;
    }

    // Insertar un nuevo municipio
    public void insertNewMunicipio(Municipio municipio) {
        Municipio.insertMunicipio(municipio);
        System.out.println("Nuevo municipio agregado: " + municipio.getId());
    }

    // Mostrar todos los municipios en la vista
    public void displayAllMunicipios() {
        List<Municipio> municipios = Municipio.getAllMunicipios();
        view.displayMunicipios(municipios);
    }
}
