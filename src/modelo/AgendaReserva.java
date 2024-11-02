package modelo;

import java.util.List;

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

    public static void insertAgendaReserva(AgendaReserva agendaReserva) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertAgendaReserva'");
    }

    public static List<AgendaReserva> getAllAgendaReservas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAgendaReservas'");
    }
}
