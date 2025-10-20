package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ReporteDeConstruccionTest {
	
	ReporteDeConstruccion reporte;
	Esfera esfera;
	Cilindro cilindro;
	PrismaRectangular prisma;
	
	
	@BeforeEach
	public void setUp() {
		reporte = new ReporteDeConstruccion();
		esfera = new Esfera("Rojo", "Hierro", 10);
		cilindro = new Cilindro("Rojo", "Madera", 50, 10);
		prisma = new PrismaRectangular("Azul", "Hierro", 50, 10, 10);
		reporte.agregarPieza(prisma);
		reporte.agregarPieza(esfera);
		reporte.agregarPieza(cilindro);
	}
	
	@Test
	public void volumenDeMaterialTest() {
		assertEquals(reporte.volumenDeMaterial("Hierro"), ((4/3)*Math.PI * Math.pow(esfera.getRadio(), 3) + (prisma.getLadoMayor() * prisma.getLadoMenor() * prisma.getAltura())));
	}
	
	@Test
	public void superficieDeColorTest() {
		assertEquals(reporte.superficieDeColor("Rojo"), (4* Math.PI * Math.pow(esfera.getRadio(), 2)) + ((2*Math.PI * cilindro.getRadio() * cilindro.getH() + 2 * Math.PI * Math.pow(cilindro.getRadio(), 2))));
	}
}
