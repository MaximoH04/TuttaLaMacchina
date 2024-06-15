package negocio;
public interface AdministradorIZ {
    //boolean validarContraseña(String Contraseña);
    void cargarAutoparte(Autopartes nuevaAutoparte);
    void obtenerCatalogo(String Catalogo);
    void modificarAutoparte(int codigo);
    void eliminarAutoparte(int codigo);
}
