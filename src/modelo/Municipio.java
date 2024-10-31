package modelo;

public class Municipio {
    private int id;
    private String nombre;

    public Municipio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Municipio [ID: " + id + ", Nombre: " + nombre + "]";
    }
}
