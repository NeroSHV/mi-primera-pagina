package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgendaReserva {
    private int id;
    private String fecha;
    private String hora;
    private int mesaId;

    public AgendaReserva(int id, String fecha, String hora, int mesaId) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.mesaId = mesaId;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public int getMesaId() {
        return mesaId;
    }

    public static void insertAgendaReserva(AgendaReserva agendaReserva) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO agenda_reserva (id, fecha, hora, mesa_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, agendaReserva.getId());
            statement.setString(2, agendaReserva.getFecha());
            statement.setString(3, agendaReserva.getHora());
            statement.setInt(4, agendaReserva.getMesaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<AgendaReserva> getAllAgendaReservas() {
        Connection con = connection.getConnection();
        List<AgendaReserva> agendaReservas = new ArrayList<>();

        String sql = "SELECT * FROM agenda_reserva";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                AgendaReserva agendaReserva = new AgendaReserva(
                        rs.getInt("id"),
                        rs.getString("fecha"),
                        rs.getString("hora"),
                        rs.getInt("mesa_id")
                );
                agendaReservas.add(agendaReserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agendaReservas;
    }

    public String getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }
}
