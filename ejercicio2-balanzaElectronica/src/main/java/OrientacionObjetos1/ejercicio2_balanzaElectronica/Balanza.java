package OrientacionObjetos1.ejercicio2_balanzaElectronica;
import java.time.LocalDate;
public class Balanza {
	
	private Integer cantProductos = 0;
	private Double precioTotal = 0.0;
	private Double pesoTotal = 0.0;
	
	public void ponerEnCero() {
		this.cantProductos = 0;
		this.pesoTotal = 0.0;
		this.precioTotal = 0.0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		LocalDate fecha = LocalDate.now();
		Ticket ticket = new Ticket(fecha, this.cantProductos, this.pesoTotal, this.precioTotal);
		return ticket;
	}

	public Integer getCantidadDeProductos() {
		return cantProductos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}
	
	
}
