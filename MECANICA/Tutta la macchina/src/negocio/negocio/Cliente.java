package negocio;



//import java.util.Scanner;


public class Cliente /*implements ClienteIZ*/{
	
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


	/*private Administrador administrador;
	
	public Cliente(Administrador administrador) {
        this.administrador = administrador;
    }
	public void reservarPedido() {
	    Scanner scanner = new Scanner(System.in);
	    boolean continuarReserva = true;
	    
	    while (continuarReserva) {
	        System.out.print("Ingrese el código de la autoparte que desea reservar o -1 para terminar: ");
	        int codigo = scanner.nextInt();
	        
	        if (codigo == -1) {
	            continuarReserva = false;
	            break;
	        }

	        boolean hayStock = false;
	        for (Autopartes autoparte : administrador.getAutopartes()) {
	            if (autoparte.getCodigo() == codigo) {
	                hayStock = true;
	                if (autoparte.getCantidadEnStock() < 1) {
	                    System.out.println("Lo sentimos, no hay suficiente stock de " + autoparte.getDenominacion());
	                } else {
	                    autoparte.descontarStock(); 
	                    System.out.println("Se ha reservado una unidad de " + autoparte.getDenominacion());
	                }
	                break;
	            }
	        }
	        if (!hayStock) {
	            System.out.println("No se encontró ninguna autoparte con el código " + codigo);
	        }
	        
	        System.out.print("¿Desea agregar otra autoparte al pedido reservado? (S/N): ");
	        String respuesta = scanner.next();
	        continuarReserva = respuesta.equalsIgnoreCase("S");
	    }
	    
	    scanner.close();
	}
	
	public void realizarPedido(){
		mostrarCatalogo();
		boolean iniciarPedido = true;
		Scanner scanner = new Scanner(System.in);
		
		while (iniciarPedido) {
			System.out.println("Ingrese código de auto parte que desea pedir o -1 para finalizar: ");
			int codigo = scanner.nextInt();
			if (codigo == -1) {
				iniciarPedido = false;
				break;
			}
		}
		//TODO
		scanner.close();
    }
	public void iniciarPago(){

    }
	public void cancelarPedido(){

    }
	public void mostrarCatalogo(){
		administrador.listarCatalogo();
    }*/
}