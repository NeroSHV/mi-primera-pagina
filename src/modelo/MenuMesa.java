package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MenuMesa {
    private int id;
    private String nombre;
    private String descripcion;

    public MenuMesa(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertMenuMesa(MenuMesa menuMesa) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO menu_mesa (id, nombre, descripcion) VALUES (?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, menuMesa.getId());
            statement.setString(2, menuMesa.getNombre());
            statement.setString(3, menuMesa.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<MenuMesa> getAllMenuMesas() {
        Connection con = connection.getConnection();
        List<MenuMesa> menuMesas = new ArrayList<>();

        String sql = "SELECT * FROM menu_mesa";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                MenuMesa menuMesa = new MenuMesa(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion")
                );
                menuMesas.add(menuMesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menuMesas;
    }
}
