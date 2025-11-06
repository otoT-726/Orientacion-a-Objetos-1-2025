package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;

public class EnvioInternacional extends Envio{

	
	private boolean entregaRapida;
	
	public EnvioInternacional(LocalDate fecha, String origen, String destino, double peso, boolean esRapido) {
		super(fecha, origen, destino, peso);
		this.entregaRapida = esRapido;
	}
	
	public double calcularCosto() {
		double total = 5000;
		if(peso < 1000)
			total += peso * 10;
		else
			total += peso * 12;
		if(entregaRapida)
			total += 800;
		return total;
	
	}
	
}
