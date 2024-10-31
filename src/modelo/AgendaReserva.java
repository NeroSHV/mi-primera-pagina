package modelo;

public class AgendaReserva {
    private int id;
    private String fecha;
    private String nid;

    public AgendaReserva(int id, String fecha, String nid) {
        this.id = id;
        this.fecha = fecha;
        this.nid = nid;
    }

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public String getNid() { return nid; }

    @Override
    public String toString() {
        return "AgendaReserva [ID: " + id + ", Fecha: " + fecha + ", NID: " + nid + "]";
    }
}
