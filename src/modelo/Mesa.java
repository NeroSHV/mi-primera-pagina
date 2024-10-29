package modelo;

public class Mesa {
    private int id;
    private int capacidad;
    private boolean disponible;

    public Mesa(int id, int capacidad, boolean disponible) {
        this.id = id;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }

    public int getId() { return id; }
    public int getCapacidad() { return capacidad; }
    public boolean isDisponible() { return disponible; }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Mesa [ID: " + id + ", Capacidad: " + capacidad + 
               ", Disponible: " + (disponible ? "Sí" : "No") + "]";
    }
}
