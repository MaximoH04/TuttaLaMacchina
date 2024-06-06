import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

public class Administrador implements AdministradorIZ,CatalogoIZ {
	private ArrayList<Autopartes> autoparte;

	public Administrador(){
		autoparte = new ArrayList<Autopartes>();
	}
	public ArrayList<Autopartes> getAutopartes() {
        return autoparte;
    }
	
	public boolean validarContraseña(String Contraseña) {
		return false;
	}

	public void cargarAutoparte() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nueva autoparte");
		
		System.out.print("Codigo: ");
		int codigo = scanner.nextInt();
		
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
		String enlace = scanner.nextLine();
		
		System.out.print("Cantidad en stock: ");
		int cantidadEnStock = scanner.nextInt();

		System.out.print("Stock minimo: ");
		int stockMinimo = scanner.nextInt();
		
		
		Autopartes nuevaAutoparte = new Autopartes(codigo, denominacion, descripcion, categoria, marca, vehiculo, modelo, precioUnitario, enlace, cantidadEnStock, stockMinimo);
		autoparte.add(nuevaAutoparte);
		scanner.close();
	}		
		

	public void obtenerCatalogo(String Catalogo) {
		
	}

	public void modificarAutoparte(int codigo) {
		Scanner scanner = new Scanner(System.in);
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

}
