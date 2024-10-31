package modelo;

public class Menu {
    private int id;
    private String descripcion;

    public Menu(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "Menu [ID: " + id + ", Descripción: " + descripcion + "]";
    }
}
