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

<<<<<<< HEAD
    // Constructor que inicializa todos los atributos
    public ReservaMesa(int reservaMesaId, String cantidadMesas, int mesaId, String agendaReservaId) {
=======
    public ReservaMesa(int reservaMesaId, int cantidadMesas, int mesaId, String agendaReservaId) {
>>>>>>> b952943091fed5e38d72b1954e231b7438ec4fd9
        this.reservaMesaId = reservaMesaId;
        this.cantidadMesas = cantidadMesas;
        this.mesaId = mesaId;
        this.agendaReservaId = agendaReservaId;
    }

<<<<<<< HEAD
    // Getters
    public int getReservaMesaId() { return reservaMesaId; }
    public String getCantidadMesas() { return cantidadMesas; }
    public int getMesaId() { return mesaId; }
    public String getAgendaReservaId() { return agendaReservaId; }

    // Método para insertar una nueva reserva de mesa en la base de datos
    public static void insertReservaMesa(ReservaMesa reservaMesa) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO reserva_mesa (reserva_mesa_id, cantidad_mesas, mesa_id, agenda_reserva_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, reservaMesa.getReservaMesaId());
            statement.setString(2, reservaMesa.getCantidadMesas());
            statement.setInt(3, reservaMesa.getMesaId());
            statement.setString(4, reservaMesa.getAgendaReservaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
=======
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
>>>>>>> b952943091fed5e38d72b1954e231b7438ec4fd9
        }
    }

    // Método para obtener todas las reservas de mesa
    public static List<ReservaMesa> getAllReservaMesas() {
        Connection con = connection.getConnection();
        List<ReservaMesa> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reserva_mesa";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                // Crear nueva instancia de ReservaMesa con los datos obtenidos
                ReservaMesa reserva = new ReservaMesa(
                    rs.getInt("reserva_mesa_id"),
<<<<<<< HEAD
                    rs.getString("cantidad_mesas"),
=======
                    rs.getInt("cantidad_mesas"),
>>>>>>> b952943091fed5e38d72b1954e231b7438ec4fd9
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
}
