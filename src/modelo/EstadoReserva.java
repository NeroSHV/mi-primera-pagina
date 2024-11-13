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

    public EstadoReserva() {
        //TODO Auto-generated constructor stub
    }

    // Getters
    public int getEstadoReservaId() {
        return estadoReservaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Método para insertar un nuevo EstadoReserva en la base de datos
    public static void insertEstadoReserva(EstadoReserva estadoReserva) {
        // Usar la conexión obtenida desde la clase de conexión db.connection
        try (Connection con = connection.getConnection(); 
             PreparedStatement statement = con.prepareStatement("INSERT INTO estado_reserva (estado_reserva_id, descripcion) VALUES (?, ?)")) {
            
            statement.setInt(1, estadoReserva.getEstadoReservaId());
            statement.setString(2, estadoReserva.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();  // Es recomendable también loguear estos errores en producción
        }
    }

    // Obtener todos los registros de EstadoReserva
    public static List<EstadoReserva> getAllEstadoReservas() {
        List<EstadoReserva> estados = new ArrayList<>();
        String sql = "SELECT * FROM estado_reserva";

        try (Connection con = connection.getConnection(); 
             PreparedStatement statement = con.prepareStatement(sql)) {
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                EstadoReserva estado = new EstadoReserva(
                    rs.getInt("estado_reserva_id"),
                    rs.getString("descripcion")
                );
                estados.add(estado);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Logueo de excepciones
        }
        return estados;
    }
}
