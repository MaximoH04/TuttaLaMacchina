package negocio;
import java.util.Scanner;
import java.util.ArrayList;

public class Administrador implements AdministradorIZ {
	private ArrayList<Autopartes> autoparte;
	private ArrayList<Cliente> clientes;
	private ArrayList<Pedido> pedidos;
	 private ArrayList<Venta> ventas;

	public Administrador(){
		autoparte = new ArrayList<Autopartes>();
		clientes = new ArrayList<Cliente>();
		pedidos = new ArrayList<Pedido>();
		ventas = new ArrayList<Venta>();
	}
	public ArrayList<Autopartes> getAutopartes() {
        return autoparte;
    }
	
	
	public void cargarAutoparte(Autopartes nuevaAutoparte) {
	    boolean codigoExistente = false;

	    // Verificar si el código de la nueva autoparte ya existe
	    for (Autopartes autoparte : autoparte) {
	        if (autoparte.getCodigo() == nuevaAutoparte.getCodigo()) {
	            codigoExistente = true;
	            break;
	        }
	    }

	    // Si el código ya existe, muestra alerta
	    while (codigoExistente) {
	        System.out.println("Ya existe una autoparte con el mismo código. Por favor, ingrese otro código:");

	        
	        Scanner scanner = new Scanner(System.in);
	        int nuevoCodigo = scanner.nextInt();
	        nuevaAutoparte.setCodigo(nuevoCodigo);

	        // Una vez que se vuelve a ingresar el codigo verifica de nuevo si existe
	        codigoExistente = false;
	        for (Autopartes autoparte : autoparte) {
	            if (autoparte.getCodigo() == nuevaAutoparte.getCodigo()) {
	                codigoExistente = true;
	                break;
	            }
	        }
	    }

	    // Si el código es válido va a agregar la autoparte
	    autoparte.add(nuevaAutoparte);
	    System.out.println("Autoparte agregada correctamente.");
	}


	public void modificarAutoparte(int codigo) {
	    Scanner scanner = new Scanner(System.in);
	    String opcion = "";
	    for(int i = 0; i < autoparte.size(); i++){
	        if(autoparte.get(i).getCodigo()==codigo){
	            
	            System.out.println("¿Qué le gustaría cambiar de la autoparte?");
	            System.out.println("Denominacion (1)");
	            System.out.println("Descripcion (2)");
	            System.out.println("Categoria (3)");
	            System.out.println("Marca (4)");
	            System.out.println("Vehiculo (5)");
	            System.out.println("Modelo (6)");
	            System.out.println("Precio unitario (7) ");
	            System.out.println("Enlace (8)");
	            System.out.println("Cantidad en stock (9)");
	            System.out.println("Stock minimo (10)");

	            opcion = scanner.next(); // Lee la opción como cadena
	            scanner.nextLine(); // Limpiar el buffer de entrada

	            if(opcion.equals("1")){
	                System.out.println("La denominacion de la autoparte es: " + autoparte.get(i).getDenominacion());
	                System.out.print("Ingrese la nueva denominacion: ");
	                String denominacion = scanner.nextLine();
	                autoparte.get(i).setDenominacion(denominacion);
	                
	            } else if (opcion.equals("2")) {
	                System.out.println("La descripcion de la autoparte es: " + autoparte.get(i).getDescripcion());
	                System.out.print("Ingrese la nueva descripcion: ");
	                String descripcion = scanner.nextLine();
	                autoparte.get(i).setDescripcion(descripcion);
	                
	            } else if (opcion.equals("3")) {
	                System.out.println("La categoria de la autoparte es: " + autoparte.get(i).getCategoria());
	                System.out.print("Ingrese la nueva categoria: ");
	                String categoria = scanner.nextLine();
	                autoparte.get(i).setCategoria(categoria);
	                
	            } else if (opcion.equals("4")) {
	                System.out.println("La marca de la autoparte es: " + autoparte.get(i).getMarca());
	                System.out.print("Ingrese la nueva marca: ");
	                String marca = scanner.nextLine();
	                autoparte.get(i).setMarca(marca);
	                
	            } else if (opcion.equals("5")) {
	                System.out.println("El vehiculo de la autoparte es: " + autoparte.get(i).getVehiculo());
	                System.out.print("Ingrese el nuevo vehiculo: ");
	                String vehiculo = scanner.nextLine();
	                autoparte.get(i).setVehiculo(vehiculo);
	                
	            } else if (opcion.equals("6")) {
	                System.out.println("El modelo de la autoparte es: " + autoparte.get(i).getModelo());
	                System.out.print("Ingrese el nuevo modelo: ");
	                String modelo = scanner.nextLine();
	                autoparte.get(i).setModelo(modelo);
	                
	            } else if (opcion.equals("7")) {
	                System.out.println("El precio unitario de la autoparte es: " + autoparte.get(i).getPrecioUnitario());
	                System.out.print("Ingrese el nuevo precio unitario: ");
	                double precio = scanner.nextDouble();
	                autoparte.get(i).setPrecioUnitario(precio);
	                
	            } else if (opcion.equals("8")) {
	                System.out.println("El enlace de la autoparte es: " + autoparte.get(i).getEnlace());
	                System.out.print("Ingrese el nuevo enlace: ");
	                scanner.nextLine(); 
	                String enlace = scanner.nextLine();
	                autoparte.get(i).setEnlace(enlace);
	                
	            } else if (opcion.equals("9")) {
	                System.out.println("La cantidad en stock de la autoparte es: " + autoparte.get(i).getCantidadEnStock());
	                System.out.print("Ingrese la nueva cantidad en stock: ");
	                int cantidad = scanner.nextInt();
	                autoparte.get(i).setCantidadEnStock(cantidad);
	                
	            } else if (opcion.equals("10")) {
	                System.out.println("El stock minimo de la autoparte es: " + autoparte.get(i).getStockMinimo());
	                System.out.print("Ingrese el nuevo stock minimo: ");
	                int stock = scanner.nextInt();
	                autoparte.get(i).setStockMinimo(stock);
	                
	            } else {
	                System.out.println("Opción no válida");
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
		if(autoparte.getCantidadEnStock() <= autoparte.getStockMinimo()) {
            	System.out.println("EN STOCK MINIMO");
			
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

	    System.out.print("Ingrese el ID del nuevo pedido: ");
	    int idPedido = sc.nextInt();

	    ArrayList<Detalle> detalles = new ArrayList<>();
	    int codigo;
	    boolean pedidoRegistrado = false;

	    do {
	        System.out.print("Ingrese el código de la autoparte que desea reservar o -1 para salir: ");
	        codigo = sc.nextInt();

	        if (codigo != -1) {
	            Autopartes autoparte = buscarAutopartePorCodigo(codigo);
	            if (autoparte != null) {
	                System.out.print("Ingrese la cantidad de la autoparte que desea reservar: ");
	                int cantidad = sc.nextInt();
	                if (cantidad > autoparte.getCantidadEnStock()) {
	                    System.out.println("No hay suficiente stock de " + autoparte.getDenominacion() + " para reservar " + cantidad + " unidades.");
	                } else {
	                    String denominacion = autoparte.getDenominacion();
	                    double precio = autoparte.getPrecioUnitario();
	                    Detalle detalle = new Detalle(codigo, denominacion, precio, cantidad);
	                    detalles.add(detalle);

	                    autoparte.descontarStock(cantidad);

	                    
	                    System.out.println("Autoparte reservada: " + denominacion + ", Cantidad: " + cantidad);
	                }
	            } else {
	                System.out.println("No se encontró ninguna autoparte con el código " + codigo);
	            }
	        }
	    } while (codigo != -1); 

	    if (!detalles.isEmpty()) {
	        Pedido pedido = new Pedido(idPedido, detalles, 0); // El monto total se calculara en la clase venta
	        pedidos.add(pedido);
	        pedidoRegistrado = true;
	        System.out.println("Pedido reservado correctamente.");
	    } else {
	        System.out.println("No se reservó ningún pedido.");
	    }

	    if (!pedidoRegistrado) {
	        System.out.println("Operación de reserva de pedido cancelada.");
	    }
	}


    private Autopartes buscarAutopartePorCodigo(int codigo) {
        for (Autopartes autoparte : autoparte) {
            if (autoparte.getCodigo() == codigo) {
                return autoparte;
            }
        }
        return null;
    }
			
	
	  public void registrarVenta() {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Registrar venta");
	        System.out.println("1. Registrar venta de una reserva");
	        System.out.println("2. Registrar venta directa");
	        System.out.print("Seleccione una opción: ");
	        int opcion = sc.nextInt();

	        if (opcion == 1) {
	            System.out.print("Ingrese el ID del pedido a vender: ");
	            int idPedido = sc.nextInt();
	            Pedido pedido = buscarPedidoPorId(idPedido);
	            if (pedido == null) {
	                System.out.println("Pedido no encontrado");
	                return;
	            }
	            registrarVentaPedido(pedido);
	        } else if (opcion == 2) {
	            registrarVentaDirecta();
	        } else {
	            System.out.println("Opción no válida");
	        }
	    }

	  private void registrarVentaPedido(Pedido pedido) {
		    double monto = 0;
		    for (Detalle detalle : pedido.getDetalles()) {
		        monto += detalle.getPrecioTotal();
		    }

		    Scanner sc = new Scanner(System.in);

		    System.out.println("Seleccione el método de pago (1: Efectivo, 2: Débito, 3: Crédito):");
		    int metodoPago = sc.nextInt();
		    sc.nextLine();

		    MedioDePago medioDePago;
		    switch (metodoPago) {
		        case 1:
		            medioDePago = new Efectivo(monto);
		            break;
		        case 2:
		            medioDePago = new Debito(monto);
		            break;
		        case 3:
		            System.out.println("Ingrese el número de cuotas (2, 3, 6):");
		            int cuotas = sc.nextInt();
		            medioDePago = new Credito(monto, cuotas);
		            break;
		        default:
		            System.out.println("Método de pago no válido.");
		            return;
		    }

		    Venta venta = new Venta(pedido.getId(), pedido.getDetalles(), medioDePago);
		    ventas.add(venta);

		    Factura factura = new Factura(venta);
		    factura.imprimirFactura();
		    
		    pedidos.remove(pedido);
		}
	  private void registrarVentaDirecta() {
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Ingrese el ID de la nueva venta: ");
		    int idVenta = sc.nextInt();

		    int codigo;
		    ArrayList<Detalle> detalles = new ArrayList<>();
		    boolean ventaRegistrada = false;

		    do {
		        System.out.print("Ingrese el código de la autoparte que desea vender o -1 para salir: ");
		        codigo = sc.nextInt();

		        if (codigo != -1) {
		            Autopartes autoparte = buscarAutopartePorCodigo(codigo);
		            if (autoparte != null) {
		                System.out.print("Ingrese la cantidad de la autoparte que desea vender: ");
		                int cantidad = sc.nextInt();
		                if (cantidad > autoparte.getCantidadEnStock()) {
		                    System.out.println("No hay suficiente stock de " + autoparte.getDenominacion() + " para vender " + cantidad + " unidades.");
		                } else {
		                    String denominacion = autoparte.getDenominacion();
		                    double precio = autoparte.getPrecioUnitario();
		                    Detalle detalle = new Detalle(codigo, denominacion, precio, cantidad);
		                    detalles.add(detalle);

		                    autoparte.descontarStock(cantidad);

		                    // Muestra el mensaje solo si se vendio la autoparte
		                    System.out.println("Autoparte vendida: " + denominacion + ", Cantidad: " + cantidad);
		                }
		            } else {
		                System.out.println("No se encontró ninguna autoparte con el código " + codigo);
		            }
		        }
		    } while (codigo != -1);

		    if (!detalles.isEmpty()) {
		        double monto = 0;
		        for (Detalle detalle : detalles) {
		            monto += detalle.getPrecioTotal();
		        }

		        System.out.println("Seleccione el método de pago (1: Efectivo, 2: Débito, 3: Crédito):");
		        int metodoPago = sc.nextInt();
		        sc.nextLine();

		        MedioDePago medioDePago;
		        switch (metodoPago) {
		            case 1:
		                medioDePago = new Efectivo(monto);
		                break;
		            case 2:
		                medioDePago = new Debito(monto);
		                break;
		            case 3:
		                System.out.println("Ingrese el número de cuotas (2, 3, 6):");
		                int cuotas = sc.nextInt();
		                medioDePago = new Credito(monto, cuotas);
		                break;
		            default:
		                System.out.println("Método de pago no válido.");
		                return;
		        }

		        Venta venta = new Venta(idVenta, detalles, medioDePago);
		        ventas.add(venta);
		        ventaRegistrada = true;

		        Factura factura = new Factura(venta);
		        factura.imprimirFactura();
		    } else {
		        System.out.println("No se registró ninguna venta.");
		    }

		    if (!ventaRegistrada) {
		        System.out.println("Operación de venta directa cancelada.");
		    }
		}


	    private Pedido buscarPedidoPorId(int idPedido) {
	        for (Pedido pedido : pedidos) {
	            if (pedido.getId() == idPedido) {
	                return pedido;
	            }
	        }
	        return null;
	    }

	    public void verVentas() {
	        System.out.println("Listado de todas las ventas:");
	        for (Venta venta : ventas) {
	            System.out.println("ID Venta: " + venta.getId() + " | Monto Total: " + venta.getMontoTotal());
	        }
	    }
	
	public void cancelarPedido(int idPedido) {
	    Pedido pedido = buscarPedidoPorId(idPedido);
	    if (pedido == null) {
	        System.out.println("Pedido no encontrado");
	        return;
	    }

	    // Devuelve el stock del pedido cancelado
	    for (Detalle detalle : pedido.getDetalles()) {
	        for (Autopartes autoparte : autoparte) {
	            if (autoparte.getCodigo() == detalle.getCodigo()) { 
	                autoparte.devolverStock(detalle.getCantidad());
	            }
	        }
	    }

	    pedidos.remove(pedido);
	    System.out.println("Pedido cancelado y stock devuelto correctamente");
	}

	
	/*private Pedido buscarPedidoPorId(int idPedido) {
		for (Pedido pedido : pedidos) {
			if (pedido.getId() == idPedido) {
				return pedido;
			}
		}
		return null;
	 } */
	
}
