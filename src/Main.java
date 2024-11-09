import controlador.TipoTerceroController;
import controlador.TerceroController;
import controlador.MunicipioController;
import controlador.AgendaReservaController;
import controlador.EstadoReservaController;
import controlador.MesaController;
import controlador.ReservaMesaController;
import controlador.EstadoMesaController;
import controlador.MenuMesaController;
import controlador.MenuController;
import controlador.DetalleMenuController;
import controlador.PlatoController;
import controlador.TipoPlatoController;
import controlador.FacturaController;
import controlador.DetalleFacturaController;
import controlador.EstadoFacturaController;
import modelo.TipoTercero;
import modelo.Tercero;
import modelo.Municipio;
import modelo.AgendaReserva;
import modelo.EstadoReserva;
import modelo.Mesa;
import modelo.ReservaMesa;
import modelo.EstadoMesa;
import modelo.DetalleMenu;
import modelo.Menu;
import modelo.DetalleMenu;
import modelo.Plato;
import modelo.TipoPlato;
import modelo.Factura;
import modelo.DetalleFactura;
import modelo.EstadoFactura;
import vista.ViewTipoTercero;
import vista.ViewTercero;
import vista.ViewMunicipio;
import vista.ViewAgendaReserva;
import vista.ViewEstadoReserva;
import vista.ViewMesa;
import vista.ViewReservaMesa;
import vista.ViewEstadoMesa;
import vista.ViewMenuMesa;
import vista.ViewMenu;
import vista.ViewDetalleMenu;
import vista.ViewPlato;
import vista.ViewTipoPlato;
import vista.ViewFactura;
import vista.ViewDetalleFactura;
import vista.ViewEstadoFactura;

@SuppressWarnings("unused")
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema de restaurante!");

        // Inicializar vistas
        ViewTipoTercero viewTipoTercero = new ViewTipoTercero();
        ViewTercero viewTercero = new ViewTercero();
        ViewMunicipio viewMunicipio = new ViewMunicipio();
        ViewAgendaReserva viewAgendaReserva = new ViewAgendaReserva();
        ViewEstadoReserva viewEstadoReserva = new ViewEstadoReserva();
        ViewMesa viewMesa = new ViewMesa();
        ViewReservaMesa viewReservaMesa = new ViewReservaMesa();
        ViewEstadoMesa viewEstadoMesa = new ViewEstadoMesa();
        ViewMenuMesa viewMenuMesa = new ViewMenuMesa();
        ViewMenu viewMenu = new ViewMenu();
        ViewDetalleMenu viewDetalleMenu = new ViewDetalleMenu();
        ViewPlato viewPlato = new ViewPlato();
        ViewTipoPlato viewTipoPlato = new ViewTipoPlato();
        ViewFactura viewFactura = new ViewFactura();
        ViewDetalleFactura viewDetalleFactura = new ViewDetalleFactura();
        ViewEstadoFactura viewEstadoFactura = new ViewEstadoFactura();

        // Inicializar controladores
        TipoTerceroController tipoTerceroController = new TipoTerceroController(viewTipoTercero);
        TerceroController terceroController = new TerceroController(viewTercero);
        MunicipioController municipioController = new MunicipioController(viewMunicipio);
        AgendaReservaController agendaReservaController = new AgendaReservaController(viewAgendaReserva);
        EstadoReservaController estadoReservaController = new EstadoReservaController(viewEstadoReserva);
        MesaController mesaController = new MesaController(viewMesa);
        ReservaMesaController reservaMesaController = new ReservaMesaController(viewReservaMesa);
        EstadoMesaController estadoMesaController = new EstadoMesaController(viewEstadoMesa);
        MenuMesaController menuMesaController = new MenuMesaController(viewMenuMesa);
        MenuController menuController = new MenuController(viewMenu);
        DetalleMenuController detalleMenuController = new DetalleMenuController(viewDetalleMenu);
        PlatoController platoController = new PlatoController(viewPlato);
        TipoPlatoController tipoPlatoController = new TipoPlatoController(viewTipoPlato);
        FacturaController facturaController = new FacturaController(viewFactura);
        DetalleFacturaController detalleFacturaController = new DetalleFacturaController(viewDetalleFactura);
        EstadoFacturaController estadoFacturaController = new EstadoFacturaController(viewEstadoFactura);

        // Ejemplo: Crear e insertar un nuevo tipo de tercero
        TipoTercero nuevoTipoTercero = new TipoTercero(1, "Cliente");
        tipoTerceroController.insertNewTipoTercero(nuevoTipoTercero);
        tipoTerceroController.displayAllTipoTerceros();

        // Ejemplo: Crear e insertar un nuevo tercero
        Tercero nuevoTercero = new Tercero(1, "Juan Pérez", "juan.perez@example.com");
        terceroController.insertNewTercero(nuevoTercero);
        terceroController.displayAllTerceros();

        // Ejemplo: Crear e insertar un nuevo municipio
        Municipio nuevoMunicipio = new Municipio(1, "Bogotá");
        municipioController.insertNewMunicipio(nuevoMunicipio);
        municipioController.displayAllMunicipios();

        // Ejemplo: Crear e insertar una nueva mesa
        Mesa nuevaMesa = new Mesa(1, 4, true);
        mesaController.insertNewMesa(nuevaMesa);
        mesaController.displayAllMesas();

        // Ejemplo: Crear e insertar una nueva reserva
        ReservaMesa nuevaReserva = new ReservaMesa(1, nuevaMesa.getMesaId(), nuevoTercero.getNid(), "2024-11-01");
        reservaMesaController.insertNewReservaMesa(nuevaReserva);
        reservaMesaController.displayAllReservasMesa();

        // Ejemplo: Crear e insertar un nuevo menú
        Menu nuevoMenu = new Menu(1, "Menú del Día", "Platos del día");
        menuController.insertNewMenu(nuevoMenu);
        menuController.displayAllMenus();

      
    }
}
