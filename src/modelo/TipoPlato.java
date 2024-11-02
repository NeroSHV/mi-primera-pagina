package modelo;

import java.util.List;

public class TipoPlato {
    private int id;
    private String descripcion;

    public TipoPlato(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "TipoPlato [ID: " + id + ", Descripción: " + descripcion + "]";
    }

    public static List<TipoPlato> getAllTipoPlatos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTipoPlatos'");
    }

    public static void insertTipoPlato(TipoPlato tipoPlato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertTipoPlato'");
    }
}
