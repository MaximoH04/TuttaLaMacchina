package negocio;

import java.text.DecimalFormat;

public class Factura {
    private Venta venta;

    public Factura(Venta venta) {
        this.venta = venta;
    }

    public void imprimirFactura() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("========= Factura de Venta =========");
        System.out.println("ID Venta: " + venta.getId());
        System.out.println("Detalles:");
        for (Detalle detalle : venta.getDetalles()) {
            System.out.println(" - Artículo: " + detalle.getArticulo() + " | Cantidad: " + detalle.getCantidad() + " | Precio Inicial: $" + df.format(detalle.getPrecioTotal()));
        }
        System.out.println("Precio Final Total: $" + df.format(venta.getMontoTotal()));
        System.out.println("Método de Pago: " + venta.getMedioDePago().getClass().getSimpleName());
        System.out.println("====================================");
    }
}
