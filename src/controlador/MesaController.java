package controlador;

import modelo.Mesa;
import vista.ViewMesa;
import java.util.List;

public class MesaController {
    private ViewMesa view;

    // Constructor
    public MesaController(ViewMesa view) {
        this.view = view;
    }

    // Insertar una nueva mesa
    public void insertNewMesa(Mesa mesa) {
        Mesa.insertMesa(mesa);
        System.out.println("Nueva mesa agregada: " + mesa.getId());
    }

    // Mostrar todas las mesas en la vista
    public void displayAllMesas() {
        List<Mesa> mesas = Mesa.getAllMesas();
        view.displayMesas(mesas);
    }
}
