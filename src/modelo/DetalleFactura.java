package modelo;

import java.util.List;

public class DetalleFactura {
    private int id;
    private int facturaId;
    private int platoId;
    private int cantidad;
    private double subtotal;

    // Constructor
    public DetalleFactura(int id, int facturaId, int platoId, int cantidad, double subtotal) {
        this.id = id;
        this.facturaId = facturaId;
        this.platoId = platoId;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    // Getters
    public int getId() { return id; }
    public int getFacturaId() { return facturaId; }
    public int getPlatoId() { return platoId; }
    public int getCantidad() { return cantidad; }
    
    public double getSubtotal() { return subtotal; }

    @Override
    public String toString() {
        return "DetalleFactura [ID: " + id + 
               ", Factura ID: " + facturaId + 
               ", Plato ID: " + platoId + 
               ", Cantidad: " + cantidad + 
               ", Subtotal: $" + subtotal + "]"; 
    }

    public static void insertDetalleFactura(DetalleFactura detalleFactura) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertDetalleFactura'");
    }

    public static List<DetalleFactura> getAllDetalleFacturas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDetalleFacturas'");
    }
}