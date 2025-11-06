package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{

	private double distancia;
	
	public EnvioInterurbano(LocalDate fecha, String origen, String destino, double peso, double distancia) {
		super(fecha, origen, destino, peso);
		this.distancia = distancia;
	}
	
	public double calcularCosto() {
		if(distancia < 100)
			return peso * 20;
		if(distancia < 500)
			return peso * 25;
		return peso * 30;
	}
}
