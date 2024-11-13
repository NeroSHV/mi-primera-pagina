package controlador;

import modelo.TipoPlato;
import vista.ViewTipoPlato;
import java.util.List;

public class TipoPlatoController {
    private ViewTipoPlato view;

    public TipoPlatoController(ViewTipoPlato view) {
        this.view = view;
    }

    public void insertNewTipoPlato(TipoPlato newTipoPlato) {
        TipoPlato.insertTipoPlato(newTipoPlato);
        view.mostrarMensaje("\nTipo de Plato guardado correctamente!");
    }

    public void displayAllTipoPlatos() {
        List<TipoPlato> tipos = TipoPlato.getAllTipoPlatos();
        view.displayListTipoPlatos(tipos);
    }
}
