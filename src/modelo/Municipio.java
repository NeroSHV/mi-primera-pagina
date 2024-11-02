package modelo;

import db.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private int id;
    private String nombre;

    public Municipio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static void insertMunicipio(Municipio municipio) {
        Connection con = connection.getConnection();

        String sql = "INSERT INTO municipio (id, nombre) VALUES (?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, municipio.getId());
            statement.setString(2, municipio.getNombre());
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
                        rs.getInt("id"),
                        rs.getString("nombre")
                );
                municipios.add(municipio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return municipios;
    }
}
