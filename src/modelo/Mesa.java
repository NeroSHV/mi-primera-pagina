package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int mesaId;
    private int numeroMesa;
    private int capacidad;
    private String ubicacion;
    private int estadoMesaId;

    public Mesa(int mesaId, int numeroMesa, int capacidad, String ubicacion, int estadoMesaId) {
        this.mesaId = mesaId;
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.estadoMesaId = estadoMesaId;
    }

    public Mesa(int i, int j, boolean b) {
        //TODO Auto-generated constructor stub
    }

    public int getMesaId() { return mesaId; }
    public int getNumeroMesa() { return numeroMesa; }
    public int getCapacidad() { return capacidad; }
    public String getUbicacion() { return ubicacion; }
    public int getEstadoMesaId() { return estadoMesaId; }

    public static void insertMesa(Mesa mesa) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO mesa (mesa_id, numero_mesa, capacidad, ubicacion, estado_mesa_id) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, mesa.getMesaId());
            statement.setInt(2, mesa.getNumeroMesa());
            statement.setInt(3, mesa.getCapacidad());
            statement.setString(4, mesa.getUbicacion());
            statement.setInt(5, mesa.getEstadoMesaId());
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
                    rs.getInt("mesa_id"),
                    rs.getInt("numero_mesa"),
                    rs.getInt("capacidad"),
                    rs.getString("ubicacion"),
                    rs.getInt("estado_mesa_id")
                );
                mesas.add(mesa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mesas;
    }
}
