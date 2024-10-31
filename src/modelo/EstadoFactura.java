package modelo;

public class EstadoFactura {
    private int estadoID;
    private String estado;

    public EstadoFactura(int estadoID, String estado) {
        this.estadoID = estadoID;
        this.estado = estado;
    }

    public int getEstadoID() { return estadoID; }
    public String getEstado() { return estado; }
}
