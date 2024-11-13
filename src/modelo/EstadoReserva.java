package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstadoReserva {
    private int estadoReservaId;
    private String descripcion;

    // Constructor con parámetros
    public EstadoReserva(int estadoReservaId, String descripcion) {
        this.estadoReservaId = estadoReservaId;
        this.descripcion = descripcion;
    }

    // Getters
    public int getEstadoReservaId() { return estadoReservaId; }
    public String getDescripcion() { return descripcion; }

    // Método para insertar un nuevo EstadoReserva en la base de datos
    public static void insertEstadoReserva(EstadoReserva estadoReserva) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO estado_reserva (estado_reserva_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoReserva.getEstadoReservaId());
            statement.setString(2, estadoReserva.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Obtener todos los registros de EstadoReserva
    public static List<EstadoReserva> getAllEstadoReservas() {
        Connection con = connection.getConnection();
        List<EstadoReserva> estados = new ArrayList<>();
        String sql = "SELECT * FROM estado_reserva";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                EstadoReserva estado = new EstadoReserva(
                    rs.getInt("estado_reserva_id"),
                    rs.getString("descripcion")
                );
                estados.add(estado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }

    // Método para obtener el ID (eliminamos el método innecesario getId())
    // Ya tenemos el método getEstadoReservaId(), no es necesario un getId() adicional
}
