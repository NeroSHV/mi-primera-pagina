package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoTercero {
    private int tipoTerceroId;
    private String descripcion;

    public TipoTercero(int tipoTerceroId, String descripcion) {
        this.tipoTerceroId = tipoTerceroId;
        this.descripcion = descripcion;
    }

    public int getTipoTerceroId() { return tipoTerceroId; }
    public String getDescripcion() { return descripcion; }

    public static void insertTipoTercero(TipoTercero tipoTercero) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO tipo_tercero (tipo_tercero_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, tipoTercero.getTipoTerceroId());
            statement.setString(2, tipoTercero.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<TipoTercero> getAllTipoTerceros() {
        Connection con = connection.getConnection();
        List<TipoTercero> tipos = new ArrayList<>();
        String sql = "SELECT * FROM tipo_tercero";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                TipoTercero tipo = new TipoTercero(
                    rs.getInt("tipo_tercero_id"),
                    rs.getString("descripcion")
                );
                tipos.add(tipo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tipos;
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}
