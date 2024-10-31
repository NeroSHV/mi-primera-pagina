package modelo;

public class ReservaMesa {
    private int id;
    private String fecha;
    private int mesaId;
    private String cliente;

    public ReservaMesa(int id, String fecha, int mesaId, String cliente) {
        this.id = id;
        this.fecha = fecha;
        this.mesaId = mesaId;
        this.cliente = cliente;
    }

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public int getMesaId() { return mesaId; }
    public String getCliente() { return cliente; }

    @Override
    public String toString() {
        return "Reserva [ID: " + id + ", Fecha: " + fecha + 
               ", Mesa: " + mesaId + ", Cliente: " + cliente + "]";
    }
}