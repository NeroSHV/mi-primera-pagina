package modelo;

public class Factura {
    private int id;
    private String fecha;
    private double total;

    public Factura(int id, String fecha, double total) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() { return id; }
    public String getFecha() { return fecha; }
    public double getTotal() { return total; }

    @Override
    public String toString() {
        return "Factura [ID: " + id + ", Fecha: " + fecha + ", Total: $" + total + "]";
    }
}