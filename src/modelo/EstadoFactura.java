package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoFactura {
    private int id;
    private String descripcion;

    public EstadoFactura(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertEstadoFactura(EstadoFactura estadoFactura) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO estado_factura (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoFactura.getId());
            statement.setString(2, estadoFactura.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<EstadoFactura> getAllEstadoFacturas() {
        Connection con = connection.getConnection();
        List<EstadoFactura> estados = new ArrayList<>();

        String sql = "SELECT * FROM estado_factura";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                EstadoFactura estadoFactura = new EstadoFactura(
                        rs.getInt("id"),
                        rs.getString("descripcion")
                );
                estados.add(estadoFactura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }
}
