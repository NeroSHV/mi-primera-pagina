package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DetalleMenu {
    private int id;
    private int menuId;
    private int platoId;

    public DetalleMenu(int id, int menuId, int platoId) {
        this.id = id;
        this.menuId = menuId;
        this.platoId = platoId;
    }

    public int getId() {
        return id;
    }

    public int getMenuId() {
        return menuId;
    }

    public int getPlatoId() {
        return platoId;
    }

    public static void insertDetalleMenu(DetalleMenu detalleMenu) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO detalle_menu (id, menu_id, plato_id) VALUES (?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, detalleMenu.getId());
            statement.setInt(2, detalleMenu.getMenuId());
            statement.setInt(3, detalleMenu.getPlatoId());
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
                DetalleMenu detalleMenu = new DetalleMenu(
                        rs.getInt("id"),
                        rs.getInt("menu_id"),
                        rs.getInt("plato_id")
                );
                detalles.add(detalleMenu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detalles;
    }

    public String getCantidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCantidad'");
    }
}
