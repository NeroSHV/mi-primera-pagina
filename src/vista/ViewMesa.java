package vista;

import modelo.Mesa;
import java.util.List;

public class ViewMesa {
    public void displayMesas(List<Mesa> mesas) {
        System.out.println("\n== Lista de Mesas ==");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
