package modelo;

import db.connection;
import java.sql.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DetalleFactura {
    private int detalleFacturaId;
    private int cantidad;
    private BigDecimal valorUnitario;
    private int portafolioId;
    private int documentoContableId;
    private int menuId;
    private int facturaId;

    public DetalleFactura(int detalleFacturaId, int cantidad, BigDecimal valorUnitario, int portafolioId, int documentoContableId, int menuId, int facturaId) {
        this.detalleFacturaId = detalleFacturaId;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.portafolioId = portafolioId;
        this.documentoContableId = documentoContableId;
        this.menuId = menuId;
        this.facturaId = facturaId;
    }

    public DetalleFactura(int detalleFacturaId2, int cantidad2, double d, int portafolioId2, int documentoContableId2,
            int menuId2, int facturaId2) {
        //TODO Auto-generated constructor stub
    }

    public int getDetalleFacturaId() { return detalleFacturaId; }
    public int getCantidad() { return cantidad; }
    public BigDecimal getValorUnitario() { return valorUnitario; }
    public int getPortafolioId() { return portafolioId; }
    public int getDocumentoContableId() { return documentoContableId; }
    public int getMenuId() { return menuId; }
    public int getFacturaId() { return facturaId; }

    public static void insertDetalleFactura(DetalleFactura detalleFactura) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO detalle_factura (cantidad, valor_unitario, portafolio_id, documento_contable_id, menu_id, factura_id) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, detalleFactura.getCantidad());
            statement.setBigDecimal(2, detalleFactura.getValorUnitario());
            statement.setInt(3, detalleFactura.getPortafolioId());
            statement.setInt(4, detalleFactura.getDocumentoContableId());
            statement.setInt(5, detalleFactura.getMenuId());
            statement.setInt(6, detalleFactura.getFacturaId());
            statement.executeUpdate();
            System.out.println("DetalleFactura insertado correctamente.");
        } catch (SQLException e) {
            System.err.println("Error al insertar DetalleFactura: " + e.getMessage());
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
                DetalleFactura detalle = new DetalleFactura(
                    rs.getInt("detalle_factura_id"),
                    rs.getInt("cantidad"),
                    rs.getBigDecimal("valor_unitario"),
                    rs.getInt("portafolio_id"),
                    rs.getInt("documento_contable_id"),
                    rs.getInt("menu_id"),
                    rs.getInt("factura_id")
                );
                detalles.add(detalle);
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener DetalleFactura: " + e.getMessage());
            e.printStackTrace();
        }
        return detalles;
    }

    // Métodos no implementados, si no los necesitas, puedes eliminarlos.
    public String getPlatoId() {
        throw new UnsupportedOperationException("Unimplemented method 'getPlatoId'");
    }

    public String getPrecio() {
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }
}
