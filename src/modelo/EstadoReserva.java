package modelo;

public class EstadoReserva {
    private int id;
    private String estado;

    public EstadoReserva(int id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    public int getId() { return id; }
    public String getEstado() { return estado; }

    @Override
    public String toString() {
        return "EstadoReserva [ID: " + id + ", Estado: " + estado + "]";
    }
}
