package controlador;

import modelo.TipoTercero;
import vista.ViewTipoTercero;
import java.util.List;

public class TipoTerceroController {
    private ViewTipoTercero view;

    // Constructor
    public TipoTerceroController(ViewTipoTercero view) {
        this.view = view;
    }

    // Insertar un nuevo tipo de tercero
    public void insertNewTipoTercero(TipoTercero tipoTercero) {
        TipoTercero.insertTipoTercero(tipoTercero);
        System.out.println("Nuevo tipo de tercero agregado: " + tipoTercero.getId());
    }

    // Mostrar todos los tipos de tercero en la vista
    public void displayAllTipoTerceros() {
        List<TipoTercero> tipos = TipoTercero.getAllTipoTerceros();
        view.displayTipoTerceros(tipos);
    }
}
