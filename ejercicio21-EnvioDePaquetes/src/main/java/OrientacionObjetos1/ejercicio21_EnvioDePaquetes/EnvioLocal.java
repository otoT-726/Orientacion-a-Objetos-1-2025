package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	
	private boolean entregaRapida;
	
	public EnvioLocal(LocalDate fecha, String origen, String destino, double peso, boolean esRapido) {
		super(fecha, origen, destino, peso);
		this.entregaRapida = esRapido;
	}
	
	
	public double calcularCosto() {
		if(this.entregaRapida)
			return 1500;
		return 1000;
	}
}
