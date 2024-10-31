package controlador;

import modelo.TipoPlato;
import vista.ViewTipoPlato;
import java.util.List;

public class TipoPlatoController {
    private ViewTipoPlato view;

    // Constructor
    public TipoPlatoController(ViewTipoPlato view) {
        this.view = view;
    }

    // Insertar un nuevo tipo de plato
    public void insertNewTipoPlato(TipoPlato tipoPlato) {
        TipoPlato.insertTipoPlato(tipoPlato);
        System.out.println("Nuevo tipo de plato agregado: " + tipoPlato.getId());
    }

    // Mostrar todos los tipos de plato en la vista
    public void displayAllTipoPlatos() {
        List<TipoPlato> tipos = TipoPlato.getAllTipoPlatos();
        view.displayTipoPlatos(tipos);
    }
}
