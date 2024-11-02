package controlador;

import modelo.Plato;
import vista.ViewPlato;


public class PlatoController {
    // Constructor
    public PlatoController(ViewPlato view) {
    }

    // Insertar un nuevo plato
    public void insertNewPlato(Plato plato) {
        Plato.insertPlato(plato);
        System.out.println("Nuevo plato agregado: " + plato.getId());
    }

    // Mostrar todos los platos en la vista
    
    
    
}