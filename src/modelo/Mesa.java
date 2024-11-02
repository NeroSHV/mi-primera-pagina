package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int id;
    private int capacidad;
    private int estadoMesaId;

    public Mesa(int id, int capacidad, int estadoMesaId) {
            this.id = id;
            this.capacidad = capacidad;
            this.estadoMesaId = estadoMesaId;
    }

    public Mesa(int id2, int capacidad2, boolean estadoMesaId2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getEstadoMesaId() {
        return estadoMesaId;
    }

    public static void insertMesa(Mesa mesa) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO mesa (id, capacidad, estado_mesa_id) VALUES (?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, mesa.getId());
            statement.setInt(2, mesa.getCapacidad());
            statement.setInt(3, mesa.getEstadoMesaId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Mesa> getAllMesas() {
        Connection con = connection.getConnection();
        List<Mesa> mesas = new ArrayList<>();

        String sql = "SELECT * FROM mesa";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Mesa mesa = new Mesa(
                        rs.getInt("id"),
                        rs.getInt("capacidad"),
                        rs.getInt("estado_mesa_id")
                );
                mesas.add(mesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesas;
    }

    public String getNumero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumero'");
    }
}
