package modelo;

import java.util.List;

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

    public static void insertEstadoReserva(EstadoReserva estadoReserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertEstadoReserva'");
    }

    public static List<EstadoReserva> getAllEstadoReservas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEstadoReservas'");
    }
}
