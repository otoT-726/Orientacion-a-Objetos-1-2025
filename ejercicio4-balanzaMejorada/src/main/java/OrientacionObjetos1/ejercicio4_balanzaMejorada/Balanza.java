package OrientacionObjetos1.ejercicio4_balanzaMejorada;
import java.util.LinkedList;
public class Balanza {
	
	private LinkedList<Producto> productos;
	
	public Balanza() {
		this.productos = new LinkedList<>();
	}
	
	public void ponerEnCero() {
		this.productos.clear();
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(this.getProductos(), this.getPesoTotal(), this.getPrecioTotal());
		return ticket;
	}

	public Integer getCantidadDeProductos() {
		return this.getProductos().size();
	}

	public Double getPrecioTotal() {
		double total = 0;
		for(Producto prod: this.getProductos()) {
			total += prod.getPrecio();
		}
		return total;
	}

	public Double getPesoTotal() {
		double total = 0;
		for(Producto prod: this.getProductos()) {
			total += prod.getPeso();
		}
		return total;
	}
	
	private LinkedList<Producto> getProductos(){
		return this.productos;
	}
	
	
}
