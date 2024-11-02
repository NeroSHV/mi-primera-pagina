package modelo;

import java.util.List;

public class MenuMesa {
    private int id;
    private String descripcion;

    public MenuMesa(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }

    @Override
    public String toString() {
        return "MenuMesa [ID: " + id + ", Descripción: " + descripcion + "]";
    }

    public static void insertMenuMesa(MenuMesa menuMesa) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMenuMesa'");
    }

    public static List<MenuMesa> getAllMenuMesas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMenuMesas'");
    }
}
