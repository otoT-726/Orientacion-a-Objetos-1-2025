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
		double total = 0;
		for(Pieza p: piezas) {
			if(p.getMaterial().equals(nombreDeMaterial))
				total += p.calcularVolumen();
		}
		return total;
	}
	
	public double superficieDeColor(String color) {
		double total = 0;
		for(Pieza p: piezas) {
			if(p.getColor().equals(color))
				total += p.calcularSuperficie();
		}
		return total;
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
