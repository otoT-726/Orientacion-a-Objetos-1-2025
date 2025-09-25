package OrientacionObjetos1.ejercicio4_balanzaMejorada;

public class Producto {
	private double peso;
	private double precioXKilo;
	private String descripcion;
	
	public Producto(String descripcion, double peso, float precio) {
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioXKilo = precio;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	public double getPrecioPorKilo() {
		return precioXKilo;
	}
	public void setPrecioPorKilo(double precioXKilo) {
		this.precioXKilo = precioXKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return this.getPrecioPorKilo() * this.getPeso();
	}
}
