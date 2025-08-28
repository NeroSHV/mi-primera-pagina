package controlador;

import modelo.Tercero;
import vista.ViewTercero;

import java.util.List;

public class TerceroController {
    private ViewTercero view;

    public TerceroController(ViewTercero view) {
        this.view = view;
    }

    public void insertNewTercero(Tercero newTercero) {
        Tercero.insertTercero(newTercero);
        view.mostrarMensaje("\nTercero guardado correctamente!");
    }

    public void displayAllTerceros() {
        List<Tercero> terceros = Tercero.getAllTerceros();
        view.displayListTerceros(terceros);
    }
}
