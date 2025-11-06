package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;

public class ClienteFisico extends Cliente{

	public ClienteFisico(String nombre, String direccion, String DNI) {
		super(nombre,direccion,DNI);
	}
	
	public double calcularCosto(LocalDate inicio, LocalDate fin) {
		return super.calcularCosto(inicio, fin) * 0.90;
	}
}
