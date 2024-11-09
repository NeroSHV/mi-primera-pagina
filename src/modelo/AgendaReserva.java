package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AgendaReserva {
    private String agendaReservaId;
    private Date fechaReserva;
    private Date fechaFin;
    private String terceroNid;
    private int estadoCitaId;
    private Time horaInicio;
    private int numeroComensales;
    private int estadoReservaId;
    private int portafolioId;

    public AgendaReserva(String agendaReservaId, Date fechaReserva, Date fechaFin, String terceroNid, int estadoCitaId, Time horaInicio, int numeroComensales, int estadoReservaId, int portafolioId) {
        this.agendaReservaId = agendaReservaId;
        this.fechaReserva = fechaReserva;
        this.fechaFin = fechaFin;
        this.terceroNid = terceroNid;
        this.estadoCitaId = estadoCitaId;
        this.horaInicio = horaInicio;
        this.numeroComensales = numeroComensales;
        this.estadoReservaId = estadoReservaId;
        this.portafolioId = portafolioId;
    }

    public String getAgendaReservaId() { return agendaReservaId; }
    public Date getFechaReserva() { return fechaReserva; }
    public Date getFechaFin() { return fechaFin; }
    public String getTerceroNid() { return terceroNid; }
    public int getEstadoCitaId() { return estadoCitaId; }
    public Time getHoraInicio() { return horaInicio; }
    public int getNumeroComensales() { return numeroComensales; }
    public int getEstadoReservaId() { return estadoReservaId; }
    public int getPortafolioId() { return portafolioId; }

    public static void insertAgendaReserva(AgendaReserva agendaReserva) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO agenda_reserva (agenda_reserva_id, fecha_reserva, fecha_fin, tercero_nid, estado_cita_id, hora_inicio, numero_comensales, estado_reserva_id, portafolio_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, agendaReserva.getAgendaReservaId());
            statement.setDate(2, agendaReserva.getFechaReserva());
            statement.setDate(3, agendaReserva.getFechaFin());
            statement.setString(4, agendaReserva.getTerceroNid());
            statement.setInt(5, agendaReserva.getEstadoCitaId());
            statement.setTime(6, agendaReserva.getHoraInicio());
            statement.setInt(7, agendaReserva.getNumeroComensales());
            statement.setInt(8, agendaReserva.getEstadoReservaId());
            statement.setInt(9, agendaReserva.getPortafolioId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<AgendaReserva> getAllAgendaReservas() {
        Connection con = connection.getConnection();
        List<AgendaReserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM agenda_reserva";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                AgendaReserva reserva = new AgendaReserva(
                    rs.getString("agenda_reserva_id"),
                    rs.getDate("fecha_reserva"),
                    rs.getDate("fecha_fin"),
                    rs.getString("tercero_nid"),
                    rs.getInt("estado_cita_id"),
                    rs.getTime("hora_inicio"),
                    rs.getInt("numero_comensales"),
                    rs.getInt("estado_reserva_id"),
                    rs.getInt("portafolio_id")
                );
                reservas.add(reserva);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
