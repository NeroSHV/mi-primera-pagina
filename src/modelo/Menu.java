package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private int menuId;
    private String descripcion;
    private int tipoPortafolioId;
    private String nombrePlato;
    private int detalleMenuId;

    public Menu(int menuId, String descripcion, int tipoPortafolioId, String nombrePlato, int detalleMenuId) {
        this.menuId = menuId;
        this.descripcion = descripcion;
        this.tipoPortafolioId = tipoPortafolioId;
        this.nombrePlato = nombrePlato;
        this.detalleMenuId = detalleMenuId;
    }

    public int getMenuId() { return menuId; }
    public String getDescripcion() { return descripcion; }
    public int getTipoPortafolioId() { return tipoPortafolioId; }
    public String getNombrePlato() { return nombrePlato; }
    public int getDetalleMenuId() { return detalleMenuId; }

    public static void insertMenu(Menu menu) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO menu (menu_id, descripcion, tipo_portafolio_id, nombre_plato, detalle_menu_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, menu.getMenuId());
            statement.setString(2, menu.getDescripcion());
            statement.setInt(3, menu.getTipoPortafolioId());
            statement.setString(4, menu.getNombrePlato());
            statement.setInt(5, menu.getDetalleMenuId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Menu> getAllMenus() {
        Connection con = connection.getConnection();
        List<Menu> menus = new ArrayList<>();
        String sql = "SELECT * FROM menu";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(
                    rs.getInt("menu_id"),
                    rs.getString("descripcion"),
                    rs.getInt("tipo_portafolio_id"),
                    rs.getString("nombre_plato"),
                    rs.getInt("detalle_menu_id")
                );
                menus.add(menu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menus;
    }
}
