package usuario;

import java.util.Scanner;
import negocio.*;

public class Interfaz {
	private static Administrador administrador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		administrador = new Administrador();
		
		
		Scanner sc = new Scanner(System.in);
		String opcion = "";
		
		
		
		do {
			System.out.println("Ingrese una opción (1 cargar autoparte, 2 modificar autoparte, 3 eliminar autoparte, 4 listar catalogo, 5 registrar cliente, 6 reservar pedido,7 registrar venta,8 Cancelar pedido, s para salir):  ");
			opcion = sc.next();
			
			if(opcion.equals("1")) {
				cargarAutoparte();
				
			}else if(opcion.equals("2")) {
				modificarAutoparte();
				
				
			}else if(opcion.equals("3")) {
				eliminarAutoparte();
				
			}else if(opcion.equals("4")) {
				listarCatalogo();
			
			}else if(opcion.equals("5")) {
				registrarCliente();
			
			}else if(opcion.equals("6")) {
				administrador.reservarPedido();
			
			}else if(opcion.equals("7")) {
				administrador.registrarVenta();
			}else if(opcion.equals("8")) {
				cancelarPedido();
			}
		}while(!opcion.equals("s"));
		sc.close();
	

	}
	
	
	public static void cargarAutoparte() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nueva autoparte");
		
		System.out.print("Codigo: ");
		int codigo = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Denominacion: ");
		String denominacion = scanner.nextLine();
		
		System.out.print("Descripcion: ");
		String descripcion = scanner.nextLine();

		System.out.print("Categoria: ");
		String categoria = scanner.nextLine();
		
		System.out.print("Marca: ");
		String marca = scanner.nextLine();
		
		System.out.print("Vehiculo: ");
		String vehiculo = scanner.nextLine();
		
		System.out.print("Modelo: ");
		String modelo = scanner.nextLine();
		
		System.out.print("Precio unitario: ");
		double precioUnitario = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Enlace: ");
		String enlace = scanner.next();
		
		System.out.print("Cantidad en stock: ");
		int cantidadEnStock = scanner.nextInt();

		System.out.print("Stock minimo: ");
		int stockMinimo = scanner.nextInt();
		
		
		Autopartes nuevaAutoparte = new Autopartes(codigo, denominacion, descripcion, categoria, marca, vehiculo, modelo, precioUnitario, enlace, cantidadEnStock, stockMinimo);
		administrador.cargarAutoparte(nuevaAutoparte);
		
	}		
	
	public static void modificarAutoparte() {
		Scanner sc = new Scanner(System.in);
		int codigo;
		System.out.println("Ingrese el codigo de la autoparte a modificar");
		codigo = sc.nextInt();
		administrador.modificarAutoparte(codigo);
	}
	
	public static void eliminarAutoparte() {
		Scanner sc = new Scanner(System.in);
		int codigo;
		System.out.println("Ingrese el codigo de la autoparte a eliminar");
		codigo = sc.nextInt();
		administrador.eliminarAutoparte(codigo);
	}
	
	public static void listarCatalogo() {
		administrador.listarCatalogo();
	}
	
	public static void registrarCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nuevo cliente");
		
		System.out.print("ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Direccion: ");
		String direccion = sc.nextLine();
		
		System.out.print("Telefono: ");
		String telefono = sc.nextLine();
		
		System.out.print("Localidad: ");
		String localidad = sc.nextLine();
		
		System.out.print("Provincia: ");
		String provincia = sc.nextLine();
		
		System.out.print("e-mail: ");
		String email = sc.nextLine();
		
		
		Cliente nuevoCliente = new Cliente(id, nombre, direccion, telefono, localidad, provincia, email);
		administrador.registrarCliente(nuevoCliente);
		
	}		
	
	 public static void cancelarPedido() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ingrese el ID del pedido a cancelar: ");
	        int idPedido = sc.nextInt();
	        administrador.cancelarPedido(idPedido);
	    }
	

}
