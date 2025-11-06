package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;

public abstract class Envio {
	
	private LocalDate fechaDespacho;
	private String direccionOrigen;
	private String direccionDestino;
	protected double peso;

	
	public Envio(LocalDate fecha, String origen, String destino, double peso) {
		this.fechaDespacho = fecha;
		this.direccionOrigen = origen;
		this.direccionDestino = destino;
		this.peso = peso;
	}
	
	
	public abstract double calcularCosto();
	
	
	public LocalDate getFechaDespacho() {
		return this.fechaDespacho;
	}
	
}
