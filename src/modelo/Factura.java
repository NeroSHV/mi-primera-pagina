package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Factura {
    private int id;
    private String fecha;
    private double total;
    private int terceroId;

    public Factura(int id, String fecha, double total, int terceroId) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.terceroId = terceroId;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public int getTerceroId() {
        return terceroId;
    }

    public static void insertFactura(Factura factura) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO factura (id, fecha, total, tercero_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, factura.getId());
            statement.setString(2, factura.getFecha());
            statement.setDouble(3, factura.getTotal());
            statement.setInt(4, factura.getTerceroId());
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
                        rs.getInt("id"),
                        rs.getString("fecha"),
                        rs.getDouble("total"),
                        rs.getInt("tercero_id")
                );
                facturas.add(factura);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return facturas;
    }
}
