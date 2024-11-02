package modelo;

import java.util.List;

public class Municipio {
    private int id;
    private String nombre;

    public Municipio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Municipio [ID: " + id + ", Nombre: " + nombre + "]";
    }

    public static void insertMunicipio(Municipio municipio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertMunicipio'");
    }

    public static List<Municipio> getAllMunicipios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMunicipios'");
    }
}
