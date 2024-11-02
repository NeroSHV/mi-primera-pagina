package controlador;

import modelo.Plato;
import vista.ViewPlato;

import java.util.List;

public class PlatoController {
    private ViewPlato view;

    public PlatoController(ViewPlato view) {
        this.view = view;
    }

    public void insertNewPlato(Plato newPlato) {
        Plato.insertPlato(newPlato);
        view.mostrarMensaje("\nPlato guardado correctamente!");
    }

    public void displayAllPlatos() {
        List<Plato> platos = Plato.getAllPlatos();
        view.displayListPlatos(platos);
    }
}
