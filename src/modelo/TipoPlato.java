package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoPlato {
    private int tipoPlatoId;
    private String descripcion;

    public TipoPlato(int tipoPlatoId, String descripcion) {
        this.tipoPlatoId = tipoPlatoId;
        this.descripcion = descripcion;
    }

    public int getTipoPlatoId() { return tipoPlatoId; }
    public String getDescripcion() { return descripcion; }

    public static void insertTipoPlato(TipoPlato tipoPlato) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO tipo_plato (tipo_plato_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, tipoPlato.getTipoPlatoId());
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
                TipoPlato tipo = new TipoPlato(
                    rs.getInt("tipo_plato_id"),
                    rs.getString("descripcion")
                );
                tipos.add(tipo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipos;
    }
}
