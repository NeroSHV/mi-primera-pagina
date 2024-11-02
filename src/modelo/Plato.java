package modelo;

import java.util.List;

public class Plato {
    public static List<Plato> getAllPl;
    private int id;
    private String nombre;
    private double precio;

    public Plato(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Plato [ID: " + id + ", Nombre: " + nombre + ", Precio: $" + precio + "]";
    }

    public static void insertPlato(Plato plato) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPlato'");
    }
}