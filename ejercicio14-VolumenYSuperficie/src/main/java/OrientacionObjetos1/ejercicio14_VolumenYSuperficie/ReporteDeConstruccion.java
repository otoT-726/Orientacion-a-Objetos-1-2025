package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

import java.util.LinkedList;

public class ReporteDeConstruccion {
	private LinkedList<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas = new LinkedList<Pieza>();
	}
	
	public void agregarPieza(Pieza p) {
		this.piezas.add(p);
	}
	
	public double volumenDeMaterial(String nombreDeMaterial) {
		return this.piezas.stream().
				filter(p ->p.getMaterial().
				equals(nombreDeMaterial)).
				mapToDouble(p -> p.calcularVolumen()).
				sum();
	}
	
	public double superficieDeColor(String color) {
		return this.piezas.stream().
				filter(p -> p.getColor().
				equals(color)).
				mapToDouble(p -> p.calcularSuperficie()).
				sum();
		}
	
//	public static void main(String[]args) {
//		ReporteDeConstruccion reporte = new ReporteDeConstruccion();
//		Esfera esfera = new Esfera("Rojo", "Hierro", 9);
//		Cilindro cilindro = new Cilindro("Rojo", "Madera", 50, 10);
//		PrismaRectangular prisma = new PrismaRectangular("Azul", "Hierro", 10, 50, 10);
//		reporte.agregarPieza(prisma);
//		reporte.agregarPieza(esfera);
//		reporte.agregarPieza(cilindro);

//		System.out.println(reporte.volumenDeMaterial("Hierro"));
//	}
}
