package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleMenu {
    private String detalleMenuId;
    private int menuId;
    private int platoId;
    private int cantidad;

    public DetalleMenu(String detalleMenuId, int menuId, int platoId, int cantidad) {
        this.detalleMenuId = detalleMenuId;
        this.menuId = menuId;
        this.platoId = platoId;
        this.cantidad = cantidad;
    }

    public String getDetalleMenuId() { return detalleMenuId; }
    public int getMenuId() { return menuId; }
    public int getPlatoId() { return platoId; }
    public int getCantidad() { return cantidad; }

    public static void insertDetalleMenu(DetalleMenu detalleMenu) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO detalle_menu (detalle_menu_id, menu_id, plato_id, cantidad) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, detalleMenu.getDetalleMenuId());
            statement.setInt(2, detalleMenu.getMenuId());
            statement.setInt(3, detalleMenu.getPlatoId());
            statement.setInt(4, detalleMenu.getCantidad());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<DetalleMenu> getAllDetalleMenus() {
        Connection con = connection.getConnection();
        List<DetalleMenu> detalles = new ArrayList<>();
        String sql = "SELECT * FROM detalle_menu";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                DetalleMenu detalle = new DetalleMenu(
                    rs.getString("detalle_menu_id"),
                    rs.getInt("menu_id"),
                    rs.getInt("plato_id"),
                    rs.getInt("cantidad")
                );
                detalles.add(detalle);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalles;
    }
}
