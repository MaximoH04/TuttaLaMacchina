package negocio;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private String fecha;
    private ArrayList<Detalle> detalles;
   

    public Pedido(int id, String fecha, ArrayList<Detalle> detalles){
        this.id = id;
        this.fecha = fecha;
        this.detalles = detalles;
        
    }

    public int getId() {
        return id;
    }

    public ArrayList<Detalle> getDetalles() {
        return detalles;
    }


}
