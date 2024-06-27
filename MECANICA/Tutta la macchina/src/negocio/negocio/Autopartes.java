package negocio;
public class Autopartes {
	private int codigo;
	private String denominacion;
	private String descripcion;
	private String categoria;
	private String marca;
	private String vehiculo;
	private String modelo;
	private double precioUnitario;
	private String enlace;
	private int cantidadEnStock;
	private int stockMinimo;
	
	public Autopartes(int codigo, String denominacion, String descripcion, String categoria, String marca, String vehiculo, String modelo, double precioUnitario, String enlace, int cantidadEnStock, int stockMinimo) {
		this.codigo= codigo;
		this.denominacion= denominacion;
		this.descripcion= descripcion;
		this.categoria= categoria;
		this.marca= marca;
		this.vehiculo= vehiculo;
		this.modelo= modelo;
		this.precioUnitario= precioUnitario;
		this.enlace = enlace;
		this.cantidadEnStock = cantidadEnStock;
		this.stockMinimo = stockMinimo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getEnlace() {
		return enlace;
	}

	public void setEnlace(String enlace) {
		this.enlace = enlace;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		this.cantidadEnStock = cantidadEnStock;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	
	public void descontarStock(int cantidad) {
	    if (cantidadEnStock >= cantidad) {
	        cantidadEnStock -= cantidad;
	        if (cantidadEnStock <= stockMinimo) {
	            System.out.println("ALERTA: EL STOCK HA LLEGADO A LA CANTIDAD MÍNIMA");
	        }
	    } else {
	        System.out.println("No hay suficiente stock");
	    }
	}

	  public void devolverStock(int cantidad) {
	        cantidadEnStock += cantidad;
	        System.out.println("Stock devuelto: " + cantidad + " de " + denominacion + ". Stock actual: " + cantidadEnStock);
	    }
	public int consultarStock() {
		return cantidadEnStock;
	}
}
