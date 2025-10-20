package OrientacionObjetos1.ejercicio5_inversores;

public class InversionEnAccion extends Inversion {
	private String nombre;
	private Double valorUnitario;
	private Integer cantidad;
	
	public InversionEnAccion(String nombre, double valorUnitario, Integer cantidad) {
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}
	
	public Double getValorActual() {
		return this.valorUnitario * this.cantidad;
	}
	
	private String getNombre() {
		return this.nombre;
	}
	
	private Double getValorUnitario() {
		return this.valorUnitario;
	}
	
	private Integer getCantidad() {
		return this.cantidad;
	}
	
	public String toString() { 
		return "Accion " + this.getNombre() + " valor: " + this.getValorUnitario() + " cantidad: " + this.getCantidad() + " valor total: " + this.getValorActual();
	}
}
