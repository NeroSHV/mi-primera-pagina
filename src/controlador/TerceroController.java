package controlador;

import modelo.Tercero;
import vista.ViewTercero;
import java.util.List;

public class TerceroController {
    private ViewTercero view;

    // Constructor
    public TerceroController(ViewTercero view) {
        this.view = view;
    }

    // Insertar un nuevo tercero
    public void insertNewTercero(Tercero tercero) {
        Tercero.insertTercero(tercero);
        System.out.println("Nuevo tercero agregado: " + tercero.getNid());
    }

    // Mostrar todos los terceros en la vista
    public void displayAllTerceros() {
        List<Tercero> terceros = Tercero.getAllTerceros();
        view.displayTerceros(terceros);
    }
}
