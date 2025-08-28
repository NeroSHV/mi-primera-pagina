package controlador;

import modelo.Mesa;
import vista.ViewMesa;

import java.util.List;

public class MesaController {
    private ViewMesa view;

    public MesaController(ViewMesa view) {
        this.view = view;
    }

    public void insertNewMesa(Mesa newMesa) {
        Mesa.insertMesa(newMesa);
        view.mostrarMensaje("\nMesa guardada correctamente!");
    }

    public void displayAllMesas() {
        List<Mesa> mesas = Mesa.getAllMesas();
        view.displayListMesas(mesas);
    }
}
