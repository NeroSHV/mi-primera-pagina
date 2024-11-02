package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoTercero {
    private int id;
    private String descripcion;

    public TipoTercero(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertTipoTercero(TipoTercero tipoTercero) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO tipo_tercero (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, tipoTercero.getId());
            statement.setString(2, tipoTercero.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<TipoTercero> getAllTipoTerceros() {
        Connection con = connection.getConnection();
        List<TipoTercero> tipoTerceros = new ArrayList<>();

        String sql = "SELECT * FROM tipo_tercero";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                TipoTercero tipoTercero = new TipoTercero(
                        rs.getInt("id"),
                        rs.getString("descripcion")
                );
                tipoTerceros.add(tipoTercero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipoTerceros;
    }
}
