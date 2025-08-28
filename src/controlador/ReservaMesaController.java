package controlador;

import modelo.ReservaMesa;
import vista.ViewReservaMesa;

import java.util.List;

public class ReservaMesaController {
    private ViewReservaMesa view;

    public ReservaMesaController(ViewReservaMesa view) {
        this.view = view;
    }

    public void insertNewReservaMesa(ReservaMesa newReservaMesa) {
        ReservaMesa.insertReservaMesa(newReservaMesa);
        view.mostrarMensaje("\nReserva de Mesa guardada correctamente!");
    }

    public void displayAllReservaMesas() {
        List<ReservaMesa> reservaMesas = ReservaMesa.getAllReservaMesas();
        view.displayListReservaMesas(reservaMesas);
    }

    public void displayAllReservasMesa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayAllReservasMesa'");
    }
}
