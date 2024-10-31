package controlador;

import modelo.EstadoMesa;
import vista.ViewEstadoMesa;
import java.util.List;

public class EstadoMesaController {
    private ViewEstadoMesa view;

    // Constructor
    public EstadoMesaController(ViewEstadoMesa view) {
        this.view = view;
    }

    // Insertar un nuevo estado de mesa
    public void insertNewEstadoMesa(EstadoMesa estadoMesa) {
        EstadoMesa.insertEstadoMesa(estadoMesa);
        System.out.println("Nuevo estado de mesa agregado: " + estadoMesa.getId());
    }

    // Mostrar todos los estados de mesa en la vista
    public void displayAllEstadoMesas() {
        List<EstadoMesa> estados = EstadoMesa.getAllEstadoMesas();
        view.displayEstadoMesas(estados);
    }
}
