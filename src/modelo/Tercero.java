package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Tercero {
    private int id;
    private String nombre;
    private String documento;
    private int tipoTerceroId;

    public Tercero(int id, String nombre, String documento, int tipoTerceroId) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.tipoTerceroId = tipoTerceroId;
    }

    public Tercero(int i, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public int getTipoTerceroId() {
        return tipoTerceroId;
    }

    public static void insertTercero(Tercero tercero) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO tercero (id, nombre, documento, tipo_tercero_id) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, tercero.getId());
            statement.setString(2, tercero.getNombre());
            statement.setString(3, tercero.getDocumento());
            statement.setInt(4, tercero.getTipoTerceroId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Tercero> getAllTerceros() {
        Connection con = connection.getConnection();
        List<Tercero> terceros = new ArrayList<>();

        String sql = "SELECT * FROM tercero";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Tercero tercero = new Tercero(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("documento"),
                        rs.getInt("tipo_tercero_id")
                );
                terceros.add(tercero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terceros;
    }
}
