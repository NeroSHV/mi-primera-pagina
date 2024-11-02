package vista;

import interfaces.IMostrarMensaje;
import modelo.Plato;

import java.util.List;

public class ViewPlato implements IMostrarMensaje {
    public void displayListPlatos(List<Plato> platos) {
        System.out.println(" == Lista de Platos == ");
        for (Plato plato : platos) {
            System.out.println("Id: " + plato.getId() + ", Nombre: " + plato.getNombre() + ", Precio: " + plato.getPrecio());
        }
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarMensaje'");
    }
}
