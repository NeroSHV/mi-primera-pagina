package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaMesa {
    private int reservaMesaId;
    private int cantidadMesas;
    private int mesaId;
    private String agendaReservaId;

    public ReservaMesa(int reservaMesaId, int cantidadMesas, int mesaId, String agendaReservaId) {
        this.reservaMesaId = reservaMesaId;
        this.cantidadMesas = cantidadMesas;
        this.mesaId = mesaId;
        this.agendaReservaId = agendaReservaId;
    }

    public int getReservaMesaId() {
        return reservaMesaId;
    }

    public int getCantidadMesas() {
        return cantidadMesas;
    }

    public int getMesaId() {
        return mesaId;
    }

    public String getAgendaReservaId() {
        return agendaReservaId;
    }

    public static void insertReservaMesa(ReservaMesa reservaMesa) {
            Connection con = connection.getConnection();
            String sql = "INSERT INTO reserva_mesa (reserva_mesa_id, cantidad_mesas, mesa_id, agenda_reserva_id) VALUES (?, ?, ?, ?)";
    
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setInt(1, reservaMesa.getReservaMesaId());
                statement.setInt(2, reservaMesa.getCantidadMesas());
                statement.setInt(3, reservaMesa.getMesaId());
                statement.setString(4, reservaMesa.getAgendaReservaId());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    
        public static List<ReservaMesa> getAllReservaMesas() {
            Connection con = connection.getConnection();
            List<ReservaMesa> reservas = new ArrayList<>();
            String sql = "SELECT * FROM reserva_mesa";
    
            try (PreparedStatement statement = con.prepareStatement(sql)) {
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    ReservaMesa reserva = new ReservaMesa(
                    rs.getInt("reserva_mesa_id"),
                    rs.getInt("cantidad_mesas"),
                    rs.getInt("mesa_id"),
                    rs.getString("agenda_reserva_id")
                );
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    public String getFecha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFecha'");
    }
    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
