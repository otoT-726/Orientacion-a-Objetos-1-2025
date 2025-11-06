package OrientacionObjetos1.ejercicio21_EnvioDePaquetes;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EnvioTest {

	private ClienteFisico clientePersona;
	private ClienteCorporativo clienteEmpresa;
	private EnvioInternacional internacional;
	private EnvioInterurbano interurbano;
	private EnvioLocal local;
	
	@BeforeEach
	public void setUp() {
		clientePersona = new ClienteFisico("marcos", "56, 726", "46749858");
		clienteEmpresa = new ClienteCorporativo("Personal", "Corrientes 1100", "992938838821");
		LocalDate fecha1 = LocalDate.of(2025, 11, 1);
		LocalDate fecha2 = LocalDate.of(2025, 11, 2);
		LocalDate fecha3 = LocalDate.of(2025, 11, 3);
		internacional = new EnvioInternacional(fecha1, "Argentina", "Marruecos", 1500, false);
		interurbano = new EnvioInterurbano(fecha2, "La Plata", "Mar del Plata", 500, 450);
		local = new EnvioLocal(fecha3, "guido 726", "belgrano 3333", 55, true);
	}
	
	@Test
	public void calcularCostoTest() {
		clientePersona.agregarEnvio(local);
		clientePersona.agregarEnvio(interurbano);
		clienteEmpresa.agregarEnvio(local);
		clienteEmpresa.agregarEnvio(internacional);
		
		LocalDate fechaInicio = LocalDate.of(2025, 11, 1);
		LocalDate fechaFin = LocalDate.of(2025, 11, 4);
		assertEquals(clientePersona.calcularCosto(fechaInicio, fechaFin), 14000);
		System.out.println(clienteEmpresa.calcularCosto(fechaInicio, fechaFin));
		assertEquals(clienteEmpresa.calcularCosto(fechaInicio, fechaFin), 24500);
	}
	
	
	
}
