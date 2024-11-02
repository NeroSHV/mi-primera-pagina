package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Plato {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Plato(int id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public static void insertPlato(Plato plato) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO plato (id, nombre, descripcion, precio) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, plato.getId());
            statement.setString(2, plato.getNombre());
            statement.setString(3, plato.getDescripcion());
            statement.setDouble(4, plato.getPrecio());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Plato> getAllPlatos() {
        Connection con = connection.getConnection();
        List<Plato> platos = new ArrayList<>();

        String sql = "SELECT * FROM plato";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Plato plato = new Plato(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getDouble("precio")
                );
                platos.add(plato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return platos;
    }
}
