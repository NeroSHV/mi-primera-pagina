package modelo;

public class EstadoMesa {
    private int id;
    private String estado;

    public EstadoMesa(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return "EstadoMesa [ID: " + id + ", Estado: " + estado + "]";
    }
}
