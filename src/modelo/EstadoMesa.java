package modelo;

import java.util.List;

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

    public static void insertEstadoMesa(EstadoMesa estadoMesa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertEstadoMesa'");
    }

    public static List<EstadoMesa> getAllEstadoMesas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEstadoMesas'");
    }
}
