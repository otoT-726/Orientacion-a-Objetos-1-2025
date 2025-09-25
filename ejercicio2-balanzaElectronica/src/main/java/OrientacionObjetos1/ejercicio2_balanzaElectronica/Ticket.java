package OrientacionObjetos1.ejercicio2_balanzaElectronica;
import java.time.LocalDate;
public class Ticket {
	private LocalDate fecha;
	private Integer cantProductos;
	private Double pesoTotal;
	private Double precioTotal;
	
	public Ticket(LocalDate fecha, Integer cantProductos, Double pesoTotal, Double precioTotal) {
		this.cantProductos = cantProductos;
		this.fecha = fecha;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getCantidadDeProductos() {
		return cantProductos;
	}
	public void setCantidadDeProductos(Integer cantProductos) {
		this.cantProductos = cantProductos;
	}
	public Double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public Double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
	
}
