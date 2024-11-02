package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoMesa {
    private int id;
    private String descripcion;

    public EstadoMesa(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertEstadoMesa(EstadoMesa estadoMesa) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO estado_mesa (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoMesa.getId());
            statement.setString(2, estadoMesa.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<EstadoMesa> getAllEstadoMesas() {
        Connection con = connection.getConnection();
        List<EstadoMesa> estados = new ArrayList<>();

        String sql = "SELECT * FROM estado_mesa";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                EstadoMesa estadoMesa = new EstadoMesa(
                        rs.getInt("id"),
                        rs.getString("descripcion")
                );
                estados.add(estadoMesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }
}
