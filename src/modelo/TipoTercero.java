package modelo;

import java.util.List;

public class TipoTercero {
    private int id;
    private String descripcion;

    public TipoTercero(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "TipoTercero [ID: " + id + ", Descripción: " + descripcion + "]";
    }

    public static void insertTipoTercero(TipoTercero tipoTercero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertTipoTercero'");
    }

    public static List<TipoTercero> getAllTipoTerceros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTipoTerceros'");
    }
}
