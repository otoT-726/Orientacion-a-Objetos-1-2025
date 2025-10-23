package OrientacionObjetos1.ejercicio18_EvenNumberSet;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.LinkedHashSet;


public class EvenNumberSetTest {
	
	EvenNumberSet set;
	
	@BeforeEach
	public void setUp() {
		set = new EvenNumberSet();
	}
	
	
	@Test
	public void addTest() {
		set.add(1);
		set.add(4);
		set.add(5);
		set.add(4);
		set.add(6);
		
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(4);
		set2.add(6);
		assertEquals(set, set2);
	}
}
