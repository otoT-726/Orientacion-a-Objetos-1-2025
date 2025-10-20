package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

public class Cilindro extends Pieza {
	private double radio;
	private double h;
	
	public Cilindro(String color, String material, double radio, double h) {
		super(color, material);
		this.radio = radio;
		this.h = h;
	}
	
	
	public double getRadio() {
		return radio;
	}

	public double getH() {
		return h;
	}


	public double calcularVolumen() {
		return Math.PI * Math.pow(radio, 2) * h;
	}
	
	public double calcularSuperficie() {
		return 2 * Math.PI * radio * h + 2 * Math.PI * Math.pow(radio, 2);
	}
}
