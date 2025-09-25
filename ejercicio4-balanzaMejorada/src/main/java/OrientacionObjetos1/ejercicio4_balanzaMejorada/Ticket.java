package OrientacionObjetos1.ejercicio4_balanzaMejorada;
import java.util.LinkedList;
import java.time.LocalDate;
public class Ticket {
	private LocalDate fecha;
	private Double pesoTotal;
	private Double precioTotal;
	private LinkedList<Producto> productos;
	
	public Ticket(LinkedList<Producto> productos, Double pesoTotal, Double precioTotal) {
		this.fecha = LocalDate.now();
		this.productos = productos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	private LinkedList<Producto> getProductos(){
		return this.productos;
	}
	
	
	public Double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
	
}
