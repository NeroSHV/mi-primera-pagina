package modelo;

public class AgendaReserva {
    private int id;  // Atributo id
    private String fechaReserva;
    private int estadoReservaId;  // Atributo para el estado de la reserva

    // Constructor
    public AgendaReserva(int id, String fechaReserva, int estadoReservaId) {
        this.id = id;
        this.fechaReserva = fechaReserva;
        this.estadoReservaId = estadoReservaId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public int getEstadoReservaId() {
        return estadoReservaId;
    }

    public void setEstadoReservaId(int estadoReservaId) {
        this.estadoReservaId = estadoReservaId;
    }
}
