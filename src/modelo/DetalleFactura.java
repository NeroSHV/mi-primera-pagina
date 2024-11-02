package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetalleFactura {
    private int id;
    private int facturaId;
    private int platoId;
    private int cantidad;

    public DetalleFactura(int id, int facturaId, int platoId, int cantidad) {
        this.id = id;
        this.facturaId = facturaId;
        this.platoId = platoId;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getFacturaId() {
        return facturaId;
    }

    public int getPlatoId() {
        return platoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public static void insertDetalleFactura(DetalleFactura detalleFactura) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO detalle_factura (id, factura_id, plato_id, cantidad) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, detalleFactura.getId());
            statement.setInt(2, detalleFactura.getFacturaId());
            statement.setInt(3, detalleFactura.getPlatoId());
            statement.setInt(4, detalleFactura.getCantidad());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<DetalleFactura> getAllDetalleFacturas() {
        Connection con = connection.getConnection();
        List<DetalleFactura> detalles = new ArrayList<>();

        String sql = "SELECT * FROM detalle_factura";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DetalleFactura detalleFactura = new DetalleFactura(
                        rs.getInt("id"),
                        rs.getInt("factura_id"),
                        rs.getInt("plato_id"),
                        rs.getInt("cantidad")
                );
                detalles.add(detalleFactura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalles;
    }

    public String getPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }
}
