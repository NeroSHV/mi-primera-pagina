package controlador;

import modelo.EstadoMesa;
import vista.ViewEstadoMesa;
import java.util.List;

public class EstadoMesaController {
    private ViewEstadoMesa view;

    public EstadoMesaController(ViewEstadoMesa view) {
        this.view = view;
    }

    public void insertNewEstadoMesa(EstadoMesa newEstadoMesa) {
        EstadoMesa.insertEstadoMesa(newEstadoMesa);
        view.mostrarMensaje("\nEstado de Mesa guardado correctamente!");
    }

    public void displayAllEstadoMesas() {
        List<EstadoMesa> estados = EstadoMesa.getAllEstadoMesas();
        view.displayListEstadoMesas(estados);
    }

    public void actualizarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarEstado'");
    }
}
