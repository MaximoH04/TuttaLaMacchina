package negocio;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Administrador implements AdministradorIZ {
	private ArrayList<Autopartes> autoparte;
	private ArrayList<Cliente> clientes;
	private ArrayList<Pedido> pedidos;

	public Administrador(){
		autoparte = new ArrayList<Autopartes>();
		clientes = new ArrayList<Cliente>();
		pedidos = new ArrayList<Pedido>();
	}
	public ArrayList<Autopartes> getAutopartes() {
        return autoparte;
    }
	
	public boolean validarContraseña(String Contraseña) {
		
		return false;
	}

	
	public void cargarAutoparte(Autopartes nuevaAutoparte) {
		autoparte.add(nuevaAutoparte);
		
	}
		

	public void obtenerCatalogo(String Catalogo) {
		
	}

	public void modificarAutoparte(int codigo) {
		Scanner scanner = new Scanner(System.in);
		String opcion = "";
		for(int i = 0; i < autoparte.size(); i++){
			if(autoparte.get(i).getCodigo()==codigo){
				
				System.out.print("¿Qué le gustaria cambiar de la autoparte?");
				System.out.print("Denominacion (1)");
				System.out.print("Descripcion (2)");
				System.out.print("Categoria (3)");
				System.out.print("Marca (4)");
				System.out.print("Vehiculo (5)");
				System.out.print("Modelo (6)");
				System.out.print("Precio unitario (7) ");
				System.out.print("Enlace (8)");
				System.out.print("Cantidad en stock (9)");
				System.out.print("Stock minimo (10)");
				opcion = scanner.next();
				
				if(opcion.equals("1")){
					System.out.println("La denominacion de la autoparte es:" + autoparte.get(i).getDenominacion());
					System.out.print("Ingrese la nueva denominacion:");
					String denominacion = scanner.next();
					autoparte.get(i).setDenominacion(denominacion);
				
					
				}else if (opcion.equals("2")) {
					System.out.println("La descripcioncion de la autoparte es:" + autoparte.get(i).getDescripcion());
					System.out.print("Ingrese la nueva descripcion:");
					String descripcion = scanner.next();
					autoparte.get(i).setDescripcion(descripcion);
					
				}else if (opcion.equals("3")) {
					System.out.println("La categoria de la autoparte es:" + autoparte.get(i).getCategoria());
					System.out.print("Ingrese la nueva categoria:");
					String categoria = scanner.next();
					autoparte.get(i).setCategoria(categoria);
				
				}else if (opcion.equals("4")) {
					System.out.println("La marca de la autoparte es:" + autoparte.get(i).getMarca());
					System.out.print("Ingrese la nueva marca:");
					String marca = scanner.next();
					autoparte.get(i).setMarca(marca);
					
				}else if (opcion.equals("5")) {
					System.out.println("El vehiculo de la autoparte es:" + autoparte.get(i).getVehiculo());
					System.out.print("Ingrese el nuevo vehiculo:");
					String vehiculo = scanner.next();
					autoparte.get(i).setVehiculo(vehiculo);
					
				}else if (opcion.equals("6")) {
					System.out.println("El modelo de la autoparte es:" + autoparte.get(i).getModelo());
					System.out.print("Ingrese el nuevo modelo:");
					String modelo = scanner.next();
					autoparte.get(i).setModelo(modelo);
					
				}else if (opcion.equals("7")) {
					System.out.println("El precio unitario de la autoparte es:" + autoparte.get(i).getPrecioUnitario());
					System.out.print("Ingrese el nuevo precio unitario:");
					double precio = scanner.nextDouble();
					autoparte.get(i).setPrecioUnitario(precio);
					
				}else if (opcion.equals("8")) {
					System.out.println("El enlace de la autoparte es:" + autoparte.get(i).getEnlace());
					System.out.print("Ingrese el nuevo enlace:");
					String enlace = scanner.next();
					autoparte.get(i).setEnlace(enlace);
					
				}else if (opcion.equals("9")) {
					System.out.println("La cantidad en stock de la autoparte es:" + autoparte.get(i).getCantidadEnStock());
					System.out.print("Ingrese la nueva cantidad en stock:");
					int cantidad = scanner.nextInt();
					autoparte.get(i).setCantidadEnStock(cantidad);
					
				}else if (opcion.equals("10")) {
					System.out.println("El stock minimo de la autoparte es:" + autoparte.get(i).getStockMinimo());
					System.out.print("Ingrese el nuevo stock minimo:");
					int stock = scanner.nextInt();
					autoparte.get(i).setStockMinimo(stock);
					
				}
					
		

			}
		
		}
		
	}
	
	public void listarCatalogo() {
        System.out.println("Catálogo de Autopartes:");
        for (Autopartes autoparte : autoparte) {
            System.out.println("Código: " + autoparte.getCodigo());
            System.out.println("Denominación : " + autoparte.getDenominacion());
            System.out.println("Descripción : " + autoparte.getDescripcion());
            System.out.println("Categoría : " + autoparte.getCategoria());
            System.out.println("Marca : " + autoparte.getMarca());
            System.out.println("Vehículo : " + autoparte.getVehiculo());
            System.out.println("Modelo : " + autoparte.getModelo());
            System.out.println("Precio Unitario : " + autoparte.getPrecioUnitario());
            System.out.println("Enlace : " + autoparte.getEnlace());
            System.out.println("Stock : " + autoparte.getCantidadEnStock());
            System.out.println("Stock Mínimo: " + autoparte.getStockMinimo());
            System.out.println("-----------------------------");
        }             
    }
	public void eliminarAutoparte(int codigo) {
		for(int i = 0; i < autoparte.size(); i++){
			if(autoparte.get(i).getCodigo()==codigo){
				autoparte.remove(i);
				return;
			}
		}
	}
	
	public void registrarCliente(Cliente nuevoCliente) {
		clientes.add(nuevoCliente);
		
	}
	
	
	public void reservarPedido() {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Nuevo pedido");
		
		System.out.print("ID: ");
		int id = sc.nextInt();
		
		System.out.print("Fecha: ");
		String fecha = sc.next();
		
		int codigo = 0;
		ArrayList<Detalle> detalles = new ArrayList<Detalle>();
		do {
			boolean existe = false;
			System.out.print("Ingrese el código de la autoparte que desea reservar o -1 para salir");
			codigo = sc.nextInt();
			
			for (int i = 0; (i < autoparte.size() && !existe); i++ ) {
				
				
				 if (autoparte.get(i).getCodigo() == codigo) {
					 existe = true;
					 System.out.print("Ingrese la cantidad de la autoparte que desea reservar)");
					 int cantidad = sc.nextInt();
					 if (cantidad > autoparte.get(i).getCantidadEnStock()) {
						 System.out.println("No hay suficiente stock de " + autoparte.get(i).getDenominacion());
						 
						 
					 }else {
						 String denominacion = autoparte.get(i).getDenominacion();
						 double precio = autoparte.get(i).getPrecioUnitario();
						 Detalle detalle = new Detalle(i, denominacion, precio, cantidad);
						 detalles.add(detalle);
						 
						 
						
						 
					 }
			 	 
				 }
			}
			if (!existe) {
				System.out.println("No se encontró ninguna autoparte con el código " + codigo);
			}
		
				
	    }while(codigo != -1);
		double monto = 0;
		
		for (int x = 0; x < detalles.size(); x++) {
			monto = monto + detalles.get(x).getPrecioTotal();
		}
			
		
		Pedido pedido = new Pedido(id, fecha, monto, detalles);
		pedidos.add(pedido);
	}
			
			
			
}