package negocio;

import java.util.ArrayList;

public class Venta {
    private int id;
    private ArrayList<Detalle> detalles;
    private MedioDePago medioDePago;

    public Venta(int id, ArrayList<Detalle> detalles, MedioDePago medioDePago) {
        this.id = id;
        this.detalles = detalles;
        this.medioDePago = medioDePago;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    public double getMontoTotal() {
        return medioDePago.calcularMontoFinal();
    }
}