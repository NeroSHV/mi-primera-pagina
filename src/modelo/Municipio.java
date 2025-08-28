package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private int municipioId;
    private String descripcion;

    public Municipio(int municipioId, String descripcion) {
        this.municipioId = municipioId;
        this.descripcion = descripcion;
    }

    public int getMunicipioId() { return municipioId; }
    public String getDescripcion() { return descripcion; }

    public static void insertMunicipio(Municipio municipio) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO municipio (municipio_id, descripcion) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, municipio.getMunicipioId());
            statement.setString(2, municipio.getDescripcion());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Municipio> getAllMunicipios() {
        Connection con = connection.getConnection();
        List<Municipio> municipios = new ArrayList<>();
        String sql = "SELECT * FROM municipio";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Municipio municipio = new Municipio(
                    rs.getInt("municipio_id"),
                    rs.getString("descripcion")
                );
                municipios.add(municipio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return municipios;
    }

    public String getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }
}
