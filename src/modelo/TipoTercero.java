package modelo;

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
}
