package controlador;

import modelo.TipoTercero;
import vista.ViewTipoTercero;

import java.util.List;

public class TipoTerceroController {
    private ViewTipoTercero view;

    public TipoTerceroController(ViewTipoTercero view) {
        this.view = view;
    }

    public void insertNewTipoTercero(TipoTercero newTipoTercero) {
        TipoTercero.insertTipoTercero(newTipoTercero);
        view.mostrarMensaje("\nTipo de Tercero guardado correctamente!");
    }

    public void displayAllTipoTerceros() {
        List<TipoTercero> tipoTerceros = TipoTercero.getAllTipoTerceros();
        view.displayListTipoTerceros(tipoTerceros);
    }
}
