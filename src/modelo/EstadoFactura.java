package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstadoFactura {
    private int estadoFacturaId;
    private String descripcion;

    public EstadoFactura(int estadoFacturaId, String descripcion) {
        this.estadoFacturaId = estadoFacturaId;
        this.descripcion = descripcion;
    }

    public int getEstadoFacturaId() { return estadoFacturaId; }
    public String getDescripcion() { return descripcion; }

    public static void insertEstadoFactura(EstadoFactura estadoFactura) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO estado_factura (estado_factura_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, estadoFactura.getEstadoFacturaId());
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
                EstadoFactura estado = new EstadoFactura(
                    rs.getInt("estado_factura_id"),
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
