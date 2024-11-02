package modelo;

import java.util.List;

public class Tercero {
    private String nid;
    private String nombres;
    private String apellidos;
    private int tipoTerceroId;

    public Tercero(String nid, String nombres, String apellidos, int tipoTerceroId) {
        this.nid = nid;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoTerceroId = tipoTerceroId;
    }

    public String getNid() { return nid; }
    public String getNombres() { return nombres; }
    public String getApellidos() { return apellidos; }
    public int getTipoTerceroId() { return tipoTerceroId; }

    @Override
    public String toString() {
        return "Tercero [NID: " + nid + ", Nombres: " + nombres + ", Apellidos: " + apellidos + 
               ", TipoTerceroID: " + tipoTerceroId + "]";
    }

    public static void insertTercero(Tercero tercero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertTercero'");
    }

    public static List<Tercero> getAllTerceros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTerceros'");
    }
}
