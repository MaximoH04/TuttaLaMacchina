import java.util.Scanner;
import java.util.*;

public class Administrador implements AdministradorIZ {

	public boolean validarContraseña(String Contraseña) {
		return false;
	}

	public void cargarAutoparte() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos de la nueva autoparte:");
		
		System.out.print("Codigo: ");
		String codigo = scanner.nextLine();
		
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
		
	}		
		

	public void obtenerCatalogo(String Catalogo) {

	}

	public int modificarAutoparte(int codigo) {
		return 0;
	}

	public void eliminarAutoparte(String Catalogo) {

	}

}
