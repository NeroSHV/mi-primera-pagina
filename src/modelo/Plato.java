package modelo;

import db.connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Plato {
    private int platoId;
    private String nombrePlatoEscogido;
    private int tipoPlatoId;

    public Plato(int platoId, String nombrePlatoEscogido, int tipoPlatoId) {
        this.platoId = platoId;
        this.nombrePlatoEscogido = nombrePlatoEscogido;
        this.tipoPlatoId = tipoPlatoId;
    }

    public int getPlatoId() { return platoId; }
    public String getNombrePlatoEscogido() { return nombrePlatoEscogido; }
    public int getTipoPlatoId() { return tipoPlatoId; }

    public static void insertPlato(Plato plato) {
        Connection con = connection.getConnection();
        String sql = "INSERT INTO plato (plato_id, nombre_plato_escogido, tipo_plato_id) VALUES (?, ?, ?)";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, plato.getPlatoId());
            statement.setString(2, plato.getNombrePlatoEscogido());
            statement.setInt(3, plato.getTipoPlatoId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Plato> getAllPlatos() {
        Connection con = connection.getConnection();
        List<Plato> platos = new ArrayList<>();
        String sql = "SELECT * FROM plato";

        try (PreparedStatement statement = con.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Plato plato = new Plato(
                    rs.getInt("plato_id"),
                    rs.getString("nombre_plato_escogido"),
                    rs.getInt("tipo_plato_id")
                );
                platos.add(plato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return platos;
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    public String getPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecio'");
    }
}
