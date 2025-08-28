import controlador.*;
import modelo.*;
import vista.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a nuestro sistema de restaurante!");

        // Inicializar vistas
        ViewTipoTercero viewTipoTercero = new ViewTipoTercero();
        ViewTercero viewTercero = new ViewTercero();
        ViewMunicipio viewMunicipio = new ViewMunicipio();
        ViewEstadoReserva viewEstadoReserva = new ViewEstadoReserva();
        ViewMesa viewMesa = new ViewMesa();
        ViewReservaMesa viewReservaMesa = new ViewReservaMesa();
        ViewEstadoMesa viewEstadoMesa = new ViewEstadoMesa();
        ViewMenuReservado viewMenuReservado = new ViewMenuReservado();
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
        EstadoReservaController estadoReservaController = new EstadoReservaController(viewEstadoReserva);
        MesaController mesaController = new MesaController(viewMesa);
        ReservaMesaController reservaMesaController = new ReservaMesaController(viewReservaMesa);
        EstadoMesaController estadoMesaController = new EstadoMesaController(viewEstadoMesa);
        MenuReservadoController menuReservadoController = new MenuReservadoController(viewMenuReservado);
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
        Tercero nuevoTercero = new Tercero("1234567890", "Juan", "Pérez", "3001234567", "juan.perez@example.com", "Calle Falsa 123", 1, 1);
        terceroController.insertNewTercero(nuevoTercero);
        terceroController.displayAllTerceros();

        // Ejemplo: Crear e insertar un nuevo municipio
        Municipio nuevoMunicipio = new Municipio(1, "Bogotá");
        municipioController.insertNewMunicipio(nuevoMunicipio);
        municipioController.displayAllMunicipios();

        // Ejemplo: Crear e insertar una nueva mesa
        Mesa nuevaMesa = new Mesa(1, 4, 6, "Terraza", 1);
        mesaController.insertNewMesa(nuevaMesa);
        mesaController.displayAllMesas();

        // Ejemplo: Crear e insertar una nueva reserva de mesa
        ReservaMesa nuevaReserva = new ReservaMesa(1, "2", nuevaMesa.getMesaId(), "1234567890");
        reservaMesaController.insertNewReservaMesa(nuevaReserva);
        reservaMesaController.displayAllReservasMesa();

        // Ejemplo: Crear e insertar un nuevo menú
        Menu nuevoMenu = new Menu(1, "Menú del Día", 1, "Plato Fuerte", 1);
        menuController.insertNewMenu(nuevoMenu);
        menuController.displayAllMenus();

        // Ejemplo: Crear e insertar un nuevo detalle de menú
        DetalleMenu nuevoDetalleMenu = new DetalleMenu(1, 3, 2, "A");
        detalleMenuController.insertNewDetalleMenu(nuevoDetalleMenu);
        detalleMenuController.displayAllDetalleMenus();

        // Ejemplo: Crear e insertar un nuevo plato
        Plato nuevoPlato = new Plato(1, "Plato Especial", 1);
        platoController.insertNewPlato(nuevoPlato);
        platoController.displayAllPlatos();

        // Ejemplo: Crear e insertar un nuevo tipo de plato
        TipoPlato nuevoTipoPlato = new TipoPlato(1, "Entrada");
        tipoPlatoController.insertNewTipoPlato(nuevoTipoPlato);
        tipoPlatoController.displayAllTipoPlatos();

        // Ejemplo: Crear e insertar una nueva factura
        Factura nuevaFactura = new Factura(1, "2024-11-01", "2024-11-15", 150000.00, 1, 1, 1, "1234");
        facturaController.insertNewFactura(nuevaFactura);
        facturaController.displayAllFacturas();

        // Ejemplo: Crear e insertar un nuevo detalle de factura
        DetalleFactura nuevoDetalleFactura = new DetalleFactura(1, 2, 50000.00, 1, 1, 1, 1);
        detalleFacturaController.insertNewDetalleFactura(nuevoDetalleFactura);
        detalleFacturaController.displayAllDetalleFacturas();

        // Ejemplo: Crear e insertar un nuevo estado de factura
        EstadoFactura nuevoEstadoFactura = new EstadoFactura(1, "Pagado");
        estadoFacturaController.insertNewEstadoFactura(nuevoEstadoFactura);
        estadoFacturaController.displayAllEstadoFacturas();
        estadoMesaController.actualizarEstado();  
        menuReservadoController.mostrarMenuReservado();  
        estadoReservaController.cambiarEstadoReserva(new EstadoReserva()); 
    }
}

