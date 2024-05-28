
public interface AdministradorIZ {
    boolean validarContraseña(String Contraseña);
    void cargarAutoparte();
    void obtenerCatalogo(String Catalogo);
    int modificarAutoparte(int codigo);
    void eliminarAutoparte(String Catalogo);
}
