package negocio;

public class Detalle {
    private int codigo;
    private String articulo;
    private double precioUnitario;
    private int cantidad;

    public Detalle(int codigo, String articulo, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getArticulo() {
        return articulo;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioUnitario * cantidad;
    }
}
