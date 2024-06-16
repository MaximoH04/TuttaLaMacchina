package negocio;



public class Cliente{
	
	int id;
	String nombre;
	String direccion;
	String telefono;
	String localidad;
	String provincia;
	String email;
	

	public Cliente(int id, String nombre, String direccion, String telefono, String localidad, String provincia, String email) {
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.localidad = localidad;
		this.provincia = provincia;
		this.email = email;
		
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public String getLocalidad() {
		return localidad;
	}
	
	public String getProvincia() {
		return provincia;
	}
	
	public String getEmail() {
		return email;
	}


	
}