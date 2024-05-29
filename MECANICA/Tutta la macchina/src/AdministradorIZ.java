
public interface AdministradorIZ {
    boolean validarContraseña(String Contraseña);
    void cargarAutoparte();
    void obtenerCatalogo(String Catalogo);
    void modificarAutoparte(int codigo);
    void eliminarAutoparte();
}
