package controlador;

import modelo.Plato;
import vista.ViewPlato;
import java.util.List;

public class PlatoController {
    private ViewPlato view;

    // Constructor
    public PlatoController(ViewPlato view) {
        this.view = view;
    }

    // Insertar un nuevo plato
    public void insertNewPlato(Plato plato) {
        Plato.insertPlato(plato);
        System.out.println("Nuevo plato agregado: " + plato.getId());
    }

    // Mostrar todos los platos en la vista
    public void displayAllPlatos() {
        List<Plato> platos = Plato.getAllPl
