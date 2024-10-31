import controlador.*;
import modelo.*;
import vista.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Inicializar vistas
        ViewAgendaReserva viewAgendaReserva = new ViewAgendaReserva();
        ViewDetalleFactura viewDetalleFactura = new ViewDetalleFactura();
        ViewDetalleMenu viewDetalleMenu = new ViewDetalleMenu();
        ViewEstadoFactura viewEstadoFactura = new ViewEstadoFactura();
        ViewEstadoMesa viewEstadoMesa = new ViewEstadoMesa();
        ViewEstadoReserva viewEstadoReserva = new ViewEstadoReserva();
        ViewFactura viewFactura = new ViewFactura();
        ViewMenu viewMenu = new ViewMenu();
        ViewMenuMesa viewMenuMesa = new ViewMenuMesa();
        ViewMesa viewMesa = new ViewMesa();
        ViewMunicipio viewMunicipio = new ViewMunicipio();
        ViewPlato viewPlato = new ViewPlato();
        ViewReservaMesa viewReservaMesa = new ViewReservaMesa();
        ViewTercero viewTercero = new ViewTercero();
        ViewTipoPlato viewTipoPlato = new ViewTipoPlato();
        ViewTipoTercero viewTipoTercero = new ViewTipoTercero();

        // Inicializar controladores
        AgendaReservaController agendaReservaController = new AgendaReservaController(viewAgendaReserva);
        DetalleFacturaController detalleFacturaController = new DetalleFacturaController(viewDetalleFactura);
        DetalleMenuController detalleMenuController = new DetalleMenuController(viewDetalleMenu);
        EstadoFacturaController estadoFacturaController = new EstadoFacturaController(viewEstadoFactura);
        EstadoMesaController estadoMesaController = new EstadoMesaController(viewEstadoMesa);
        EstadoReservaController estadoReservaController = new EstadoReservaController(viewEstadoReserva);
        FacturaController facturaController = new FacturaController(viewFactura);
        MenuController menuController = new MenuController(viewMenu);
        MenuMesaController menuMesaController = new MenuMesaController(viewMenuMesa);
        MesaController mesaController = new MesaController(viewMesa);
        MunicipioController municipioController = new MunicipioController(viewMunicipio);
        PlatoController platoController = new PlatoController(viewPlato);
        ReservaMesaController reservaMesaController = new ReservaMesaController(viewReservaMesa);
        TerceroController terceroController = new TerceroController(viewTercero);
        TipoPlatoController tipoPlatoController = new TipoPlatoController(viewTipoPlato);
        TipoTerceroController tipoTerceroController = new TipoTerceroController(viewTipoTercero);

        // Crear algunos ejemplos de datos y mostrarlos

        // Ejemplo de Municipio
        Municipio municipio = new Municipio(1, "Bogotá");
        List<Municipio> municipios = new ArrayList<>();
        municipios.add(municipio);
        viewMunicipio.displayListMunicipios(municipios);

        // Ejemplo de Tercero y TipoTercero
        TipoTercero tipoTercero = new TipoTercero(1, "Cliente");
        Tercero tercero = new Tercero("12345", "Juan", "Pérez", tipoTercero.getId());
        List<TipoTercero> tiposTercero = new ArrayList<>();
        tiposTercero.add(tipoTercero);
        viewTipoTercero.displayListTipoTerceros(tiposTercero);
        List<Tercero> terceros = new ArrayList<>();
        terceros.add(tercero);
        viewTercero.displayListTerceros(terceros);

        // Ejemplo de Mesa y EstadoMesa
        EstadoMesa estadoMesa = new EstadoMesa(1, "Disponible");
        Mesa mesa = new Mesa(1, 4, "Ventana");
        List<EstadoMesa> estadosMesa = new ArrayList<>();
        estadosMesa.add(estadoMesa);
        viewEstadoMesa.displayListEstadoMesas(estadosMesa);
        List<Mesa> mesas = new ArrayList<>();
        mesas.add(mesa);
        viewMesa.displayListMesas(mesas);

        // Ejemplo de Factura y EstadoFactura
        EstadoFactura estadoFactura = new EstadoFactura(1, "Pagada");
        Factura factura = new Factura(1, "2024-10-28", 150000);
        List<EstadoFactura> estadosFactura = new ArrayList<>();
        estadosFactura.add(estadoFactura);
        viewEstadoFactura.displayListEstadoFacturas(estadosFactura);
        List<Factura> facturas = new ArrayList<>();
        facturas.add(factura);
        viewFactura.displayListFacturas(facturas);

        // Ejemplo de Menu, DetalleMenu y Plato
        Plato plato = new Plato(1, "Pizza", 25000);
        Menu menu = new Menu(1, "Menú Italiano");
        DetalleMenu detalleMenu = new DetalleMenu(1, menu.getId(), plato.getId());
        List<Plato> platos = new ArrayList<>();
        platos.add(plato);
        viewPlato.displayListPlatos(platos);
        List<Menu> menus = new ArrayList<>();
        menus.add(menu);
        viewMenu.displayListMenus(menus);
        List<DetalleMenu> detallesMenu = new ArrayList<>();
        detallesMenu.add(detalleMenu);
        viewDetalleMenu.displayListDetalleMenus(detallesMenu);

        // Ejemplo de ReservaMesa y AgendaReserva
        ReservaMesa reservaMesa = new ReservaMesa(1, "2024-10-28", mesa.getId(), tercero.getNid());
        AgendaReserva agendaReserva = new AgendaReserva(1, "2024-10-28", tercero.getNid());
        List<ReservaMesa> reservasMesa = new ArrayList<>();
        reservasMesa.add(reservaMesa);
        viewReservaMesa.displayListReservaMesas(reservasMesa);
        List<AgendaReserva> agendasReserva = new ArrayList<>();
        agendasReserva.add(agendaReserva);
        viewAgendaReserva.displayListAgendaReservas(agendasReserva);

        System.out.println("Sistema inicializado y ejemplos mostrados en consola.");
    }
}
