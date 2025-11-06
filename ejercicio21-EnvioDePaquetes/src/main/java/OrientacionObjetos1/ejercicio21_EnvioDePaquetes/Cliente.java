package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;
import java.util.LinkedList;
import OrientacionObjetos1.ejercicio16_DateLapse.DateLapse;

public abstract class Cliente {

	private String nombre;
	private String direccion;
	private String identificador;
	private LinkedList<Envio> envios;
	
	public Cliente(String nombre, String direccion, String identificador) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.identificador = identificador;
		envios = new LinkedList<Envio>();
	}
	
	public boolean agregarEnvio(Envio envio) {
		if(envios.add(envio))
			return true;
		return false;
	}
	
	
	public double calcularCosto(LocalDate inicio, LocalDate fin) {
		DateLapse lapso = new DateLapse(inicio, fin);
		return this.envios.stream().
					filter(e -> lapso.includesDate(e.getFechaDespacho())).
					mapToDouble(e -> e.calcularCosto()).
					sum();
	}
}
