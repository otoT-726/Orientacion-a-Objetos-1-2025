package OrientacionObjetos1.ejercicio11_cuentaAbstracta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class cajaDeAhorroTest {
	
	CajaDeAhorro cuenta;
	
	@BeforeEach
	public void setUp() {
		cuenta = new CajaDeAhorro();
	}
	
	@Test
	public void puedeExtraerTest() {
		cuenta.depositar(1000);
		assertTrue(cuenta.puedeExtraer(960));
		assertFalse(cuenta.puedeExtraer(981));
	}
}
