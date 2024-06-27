package negocio;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private ArrayList<Detalle> detalles;
    private double montoTotal;

    public Pedido(int id, ArrayList<Detalle> detalles, double montoTotal) {
        this.id = id;
        this.detalles = detalles;
        this.montoTotal = montoTotal;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public Venta generarVenta(MedioDePago medioDePago) {
        return new Venta(this.id, this.detalles, medioDePago);
    }
}
