package interfaces;

public interface IMostrarMensaje {
    
    // Método para mostrar un mensaje genérico
    void mostrarMensaje(String mensaje);

    // Método para mostrar un mensaje de éxito
    default void mostrarMensajeExito(String mensaje) {
        mostrarMensaje("ÉXITO: " + mensaje);
    }

    // Método para mostrar un mensaje de advertencia
    default void mostrarMensajeAdvertencia(String mensaje) {
        mostrarMensaje("ADVERTENCIA: " + mensaje);
    }

    // Método para mostrar un mensaje de error
    default void mostrarMensajeError(String mensaje) {
        mostrarMensaje("ERROR: " + mensaje);
    }

    // Método para mostrar mensajes con formato
    default void mostrarMensajeFormato(String mensaje, Object... args) {
        String mensajeFormateado = String.format(mensaje, args);
        mostrarMensaje(mensajeFormateado);
    }

    // Método para mostrar un mensaje de información
    default void mostrarMensajeInformacion(String mensaje) {
        mostrarMensaje("INFO: " + mensaje);
    }
}
