package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Tercero {
    private String nid;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String email;
    private String direccion;
    private int tipoTerceroId;
    private int municipioId;

    public Tercero(String nid, String nombres, String apellidos, String telefono, String email, String direccion, int tipoTerceroId, int municipioId) {
        this.nid = nid;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.tipoTerceroId = tipoTerceroId;
        this.municipioId = municipioId;
    }

    public Tercero(int i, String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public String getNid() { return nid; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    public String getDireccion() { return direccion; }
    public int getTipoTerceroId() { return tipoTerceroId; }
    public int getMunicipioId() { return municipioId; }

    public static void insertTercero(Tercero tercero) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO tercero (nid, nombres, apellidos, telefono, email, direccion, tipo_tercero_id, municipio_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setString(1, tercero.getNid());
            statement.setString(2, tercero.getNombres());
            statement.setString(3, tercero.getApellidos());
            statement.setString(4, tercero.getTelefono());
            statement.setString(5, tercero.getEmail());
            statement.setString(6, tercero.getDireccion());
            statement.setInt(7, tercero.getTipoTerceroId());
            statement.setInt(8, tercero.getMunicipioId());
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
                    rs.getString("nid"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("telefono"),
                    rs.getString("email"),
                    rs.getString("direccion"),
                    rs.getInt("tipo_tercero_id"),
                    rs.getInt("municipio_id")
                );
                terceros.add(tercero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return terceros;
    }
}
