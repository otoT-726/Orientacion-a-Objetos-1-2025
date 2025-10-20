package OrientacionObjetos1.ejercicio17_DateLapse2;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapse lapso;
	LocalDate hoy;
	LocalDate ayer;
	LocalDate mañana;
	
	@BeforeEach
	public void setUp() {
		hoy = LocalDate.now();
		ayer = LocalDate.of(2025, 10, 17);
		mañana = LocalDate.of(2025, 10, 19);
		lapso = new DateLapse(ayer, 2);
	}
	
	@Test
	public void getTest() {
		assertEquals(lapso.getFrom(), LocalDate.of(2025, 10, 17));
		assertEquals(lapso.getTo(), LocalDate.of(2025, 10, 19));
	}
	
	@Test
	public void sizeInDaysTest() {
		assertEquals(lapso.sizeInDays(), 2);
	}
	
	@Test
	public void includesDateTest() {
		assertTrue(lapso.includesDate(hoy));
		assertTrue(lapso.includesDate(ayer));
		assertTrue(lapso.includesDate(mañana));
		assertFalse(lapso.includesDate(LocalDate.of(2025, 10, 20)));
	}
}
