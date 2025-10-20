package OrientacionObjetos1.ejercicio5_inversores;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class InversorTest {
	Inversor inversor;
	InversionEnAccion inversionAccion;
	InversionEnPlazoFijo inversionBanco;
	
	@BeforeEach
	public void setUp() {
		inversor = new Inversor();
		inversionAccion = new InversionEnAccion("NVDA", 170, 10);
		inversionBanco = new InversionEnPlazoFijo(500, 2.5);
		inversor.agregarInversion(inversionAccion);
		inversor.agregarInversion(inversionBanco);
	}
	
	@Test
	public void getValorActualTest() {
		assertEquals(inversor.getValorActual(), (170 * 10) + (500 * 2.5));
	}
}
