package modelo;

import java.util.List;

public class EstadoFactura {
    private int estadoID;
    private String estado;

    public EstadoFactura(int estadoID, String estado) {
        this.estadoID = estadoID;
        this.estado = estado;
    }

    public int getEstadoID() { return estadoID; }
    public String getEstado() { return estado; }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public static void insertEstadoFactura(EstadoFactura estadoFactura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertEstadoFactura'");
    }

    public static List<EstadoFactura> getAllEstadoFacturas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEstadoFacturas'");
    }
}
