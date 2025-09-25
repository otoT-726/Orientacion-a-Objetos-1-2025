package OrientacionObjetos1.ejercicio3_Presupuesto;
import java.util.LinkedList;
import java.time.LocalDate;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private LinkedList<Item> items;

	public Presupuesto(String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.items = new LinkedList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public Double calcularTotal() {
		Double total = 0.0;
		for(Item i: this.items) {
			total += i.costo();
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public LinkedList<Item> getItems() {
		return items;
	}

	public void setItems(LinkedList<Item> items) {
		this.items = items;
	}
	
	
}
