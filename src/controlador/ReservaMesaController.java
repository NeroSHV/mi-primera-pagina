package controlador;

import modelo.ReservaMesa;
import vista.ViewReservaMesa;
import java.util.List;

public class ReservaMesaController {
    private ViewReservaMesa view;

    // Constructor
    public ReservaMesaController(ViewReservaMesa view) {
        this.view = view;
    }

    // Insertar una nueva reserva de mesa
    public void insertNewReservaMesa(ReservaMesa reservaMesa) {
        ReservaMesa.insertReservaMesa(reservaMesa);
        System.out.println("Nueva reserva de mesa agregada: " + reservaMesa.getId());
    }

    // Mostrar todas las reservas de mesa en la vista
    public void displayAllReservaMesas() {
        List<ReservaMesa> reservas = ReservaMesa.getAllReservaMesas();
        view.displayReservaMesas(reservas);
    }
}
