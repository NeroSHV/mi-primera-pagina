package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MenuReservado {
    private int menuReservadoId;
    private double cantidadDeMenus;
    private int menuId;
    private int reservaMesaId;

    public MenuReservado(int menuReservadoId, double cantidadDeMenus, int menuId, int reservaMesaId) {
        this.menuReservadoId = menuReservadoId;
        this.cantidadDeMenus = cantidadDeMenus;
        this.menuId = menuId;
        this.reservaMesaId = reservaMesaId;
    }

    public int getMenuReservadoId() { return menuReservadoId; }
    public double getCantidadDeMenus() { return cantidadDeMenus; }
    public int getMenuId() { return menuId; }
    public int getReservaMesaId() { return reservaMesaId; }

    public static void insertMenuReservado(MenuReservado menuReservado) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO menu_reservado (menu_reservado_id, cantidad_de_menus, menu_id, reserva_mesa_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, menuReservado.getMenuReservadoId());
            statement.setDouble(2, menuReservado.getCantidadDeMenus());
            statement.setInt(3, menuReservado.getMenuId());
            statement.setInt(4, menuReservado.getReservaMesaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<MenuReservado> getAllMenuReservados() {
        Connection con = connection.getConnection();
        List<MenuReservado> menuReservados = new ArrayList<>();
        String sql = "SELECT * FROM menu_reservado";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                MenuReservado menuReservado = new MenuReservado(
                    rs.getInt("menu_reservado_id"),
                    rs.getDouble("cantidad_de_menus"),
                    rs.getInt("menu_id"),
                    rs.getInt("reserva_mesa_id")
                );
                menuReservados.add(menuReservado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menuReservados;
    }
}
