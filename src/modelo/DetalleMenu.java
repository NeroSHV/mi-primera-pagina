package modelo;

import java.util.List;

public class DetalleMenu {
    private int id;
    private int menuId;
    private int platoId;

    public DetalleMenu(int id, int menuId, int platoId) {
        this.id = id;
        this.menuId = menuId;
        this.platoId = platoId;
    }

    public int getId() { return id; }
    public int getMenuId() { return menuId; }
    public int getPlatoId() { return platoId; }

    @Override
    public String toString() {
        return "DetalleMenu [ID: " + id + ", Menu: " + menuId + ", Plato: " + platoId + "]";
    }

    public static void insertDetalleMenu(DetalleMenu detalleMenu) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertDetalleMenu'");
    }

    public static List<DetalleMenu> getAllDetalleMenus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDetalleMenus'");
    }
}
