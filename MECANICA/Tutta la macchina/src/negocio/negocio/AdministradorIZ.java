package negocio;
public interface AdministradorIZ {
    void cargarAutoparte(Autopartes nuevaAutoparte);
    void modificarAutoparte(int codigo);
    void eliminarAutoparte(int codigo);
    void registrarCliente(Cliente nuevoCliente);
    void reservarPedido();
    void registrarVenta();
    void cancelarPedido(int idPedido);
}
