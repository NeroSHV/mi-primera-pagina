package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoPlato {
    private int id;
    private String descripcion;

    public TipoPlato(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public static void insertTipoPlato(TipoPlato tipoPlato) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO tipo_plato (id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, tipoPlato.getId());
            statement.setString(2, tipoPlato.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<TipoPlato> getAllTipoPlatos() {
        Connection con = connection.getConnection();
        List<TipoPlato> tipos = new ArrayList<>();

        String sql = "SELECT * FROM tipo_plato";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                TipoPlato tipoPlato = new TipoPlato(
                        rs.getInt("id"),
                        rs.getString("descripcion")
                );
                tipos.add(tipoPlato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipos;
    }
}
