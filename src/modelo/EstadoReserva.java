package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoReserva {
    private int id;
    private String descripcion;

    public EstadoReserva(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertEstadoReserva(EstadoReserva estadoReserva) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO estado_reserva (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoReserva.getId());
            statement.setString(2, estadoReserva.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<EstadoReserva> getAllEstadoReservas() {
        Connection con = connection.getConnection();
        List<EstadoReserva> estados = new ArrayList<>();

        String sql = "SELECT * FROM estado_reserva";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                EstadoReserva estadoReserva = new EstadoReserva(
                        rs.getInt("id"),
                        rs.getString("descripcion")
                );
                estados.add(estadoReserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }
}
