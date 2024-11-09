package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int facturaId;
    private Date fechaEmision;
    private Date fechaVence;
    private double valor;
    private int estadoPagoId;
    private int tipoDocContableId;
    private int estadoFacturaId;
    private String agendaReservaId;

    public Factura(int facturaId, Date fechaEmision, Date fechaVence, double valor, int estadoPagoId, int tipoDocContableId, int estadoFacturaId, String agendaReservaId) {
        this.facturaId = facturaId;
        this.fechaEmision = fechaEmision;
        this.fechaVence = fechaVence;
        this.valor = valor;
        this.estadoPagoId = estadoPagoId;
        this.tipoDocContableId = tipoDocContableId;
        this.estadoFacturaId = estadoFacturaId;
        this.agendaReservaId = agendaReservaId;
    }

    public int getFacturaId() { return facturaId; }
    public Date getFechaEmision() { return fechaEmision; }
    public Date getFechaVence() { return fechaVence; }
    public double getValor() { return valor; }
    public int getEstadoPagoId() { return estadoPagoId; }
    public int getTipoDocContableId() { return tipoDocContableId; }
    public int getEstadoFacturaId() { return estadoFacturaId; }
    public String getAgendaReservaId() { return agendaReservaId; }

    public static void insertFactura(Factura factura) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO factura (factura_id, fecha_emision, fecha_vence, valor, estado_pago_id, tipo_doc_contable_id, estado_factura_id, agenda_reserva_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, factura.getFacturaId());
            statement.setDate(2, factura.getFechaEmision());
            statement.setDate(3, factura.getFechaVence());
            statement.setDouble(4, factura.getValor());
            statement.setInt(5, factura.getEstadoPagoId());
            statement.setInt(6, factura.getTipoDocContableId());
            statement.setInt(7, factura.getEstadoFacturaId());
            statement.setString(8, factura.getAgendaReservaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Factura> getAllFacturas() {
        Connection con = connection.getConnection();
        List<Factura> facturas = new ArrayList<>();
        String sql = "SELECT * FROM factura";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Factura factura = new Factura(
                    rs.getInt("factura_id"),
                    rs.getDate("fecha_emision"),
                    rs.getDate("fecha_vence"),
                    rs.getDouble("valor"),
                    rs.getInt("estado_pago_id"),
                    rs.getInt("tipo_doc_contable_id"),
                    rs.getInt("estado_factura_id"),
                    rs.getString("agenda_reserva_id")
                );
                facturas.add(factura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public String getTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTotal'");
    }
}
