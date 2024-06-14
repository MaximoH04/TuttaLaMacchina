package negocio;

public class Detalle {
	 int id;
	 String articulo;
	 double precio;
	 int cantidad;
	 
	 
	 
	 public Detalle(int id, String articulo, double precio, int cantidad) {
		 this.id = id;
		 this.articulo = articulo;
		 this.precio = precio;
		 this.cantidad = cantidad;
		
	 }
	 
	 public int getId() {
		 return id;
	 }
	 
	 public String getArticulo() {
		 return articulo;
	 }
	 
	 public double getPrecio(){
		 return precio;
	 }
	 
	 public int getCantidad() {
		 return cantidad;
	 }
	 
	 public double getPrecioTotal() {
		 return (precio * cantidad);
	 }

}
