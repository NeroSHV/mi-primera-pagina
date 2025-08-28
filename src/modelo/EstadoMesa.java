package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstadoMesa {
    private int estadoMesaId;
    private String descripcion;

    public EstadoMesa(int estadoMesaId, String descripcion) {
        this.estadoMesaId = estadoMesaId;
        this.descripcion = descripcion;
    }

    public int getEstadoMesaId() { return estadoMesaId; }
    public String getDescripcion() { return descripcion; }

    public static void insertEstadoMesa(EstadoMesa estadoMesa) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO estado_mesa (estado_mesa_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoMesa.getEstadoMesaId());
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
                EstadoMesa estado = new EstadoMesa(
                    rs.getInt("estado_mesa_id"),
                    rs.getString("descripcion")
                );
                estados.add(estado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estados;
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
