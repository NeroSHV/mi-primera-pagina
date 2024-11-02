package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservaMesa {
    private int id;
    private String fecha;
    private int mesaId;
    private int terceroId;

    public ReservaMesa(int id, String fecha, int mesaId, int terceroId) {
        this.id = id;
        this.fecha = fecha;
        this.mesaId = mesaId;
        this.terceroId = terceroId;
    }

    public ReservaMesa(int id2, int id3, int id4, String fecha2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public int getMesaId() {
        return mesaId;
    }

    public int getTerceroId() {
        return terceroId;
    }

    public static void insertReservaMesa(ReservaMesa reservaMesa) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO reserva_mesa (id, fecha, mesa_id, tercero_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, reservaMesa.getId());
            statement.setString(2, reservaMesa.getFecha());
            statement.setInt(3, reservaMesa.getMesaId());
            statement.setInt(4, reservaMesa.getTerceroId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<ReservaMesa> getAllReservasMesa() {
        Connection con = connection.getConnection();
        List<ReservaMesa> reservas = new ArrayList<>();

        String sql = "SELECT * FROM reserva_mesa";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            var rs = statement.executeQuery();
            while (rs.next()) {
                ReservaMesa reservaMesa = new ReservaMesa(
                        rs.getInt("id"),
                        rs.getString("fecha"),
                        rs.getInt("mesa_id"),
                        rs.getInt("tercero_id")
                );
                reservas.add(reservaMesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservas;
    }
}
