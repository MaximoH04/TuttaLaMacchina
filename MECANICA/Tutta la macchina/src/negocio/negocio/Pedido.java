package negocio;

import java.util.ArrayList;

public class Pedido {
	
	int id;
	String fecha;
	ArrayList<Detalle> detalles;
	double montoTotal;

	

	public Pedido(int id, String fecha, double montoTotal,ArrayList<Detalle> detalles) {
		this.id = id;
		this.fecha = fecha;
		this.montoTotal = montoTotal;
		this.detalles = detalles;
		
	}
	



public ArrayList<Detalle> getDetalles(){
	return detalles;
}


}
