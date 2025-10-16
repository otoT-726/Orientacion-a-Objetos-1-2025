package OrientacionObjetos1.ejercicio11_cuentaAbstracta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class cuentaCorrienteTest {
	
	private CuentaCorriente cuenta;
	
	@BeforeEach
	public void setUp(){
		cuenta = new CuentaCorriente();
	}
	
	@Test
	public void puedeExtraerTest() {
		cuenta.depositar(5000);
		cuenta.setLimiteDescubierto(500);
		assertTrue(cuenta.puedeExtraer(5500));
		assertFalse(cuenta.puedeExtraer(5501));
		cuenta.extraer(5000);
		assertEquals(cuenta.getSaldo(), 0);
	}
	
	@Test
	public void transferirACuentaTest() {
		CuentaCorriente cuentaDestino = new CuentaCorriente();
		cuenta.depositar(5000);
		cuenta.setLimiteDescubierto(100);
		cuenta.transferirACuenta(5020, cuentaDestino);
		assertEquals(cuentaDestino.getSaldo(), 5020);
	}
	
}
