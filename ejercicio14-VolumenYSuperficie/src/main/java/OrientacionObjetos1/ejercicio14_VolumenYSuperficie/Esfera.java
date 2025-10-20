package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

public class Esfera extends Pieza {
	private double radio;
	
	public Esfera(String color, String material, double radio) {
		super(color, material);
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	
	public double calcularVolumen() {
		return (4/3) * Math.PI * Math.pow(radio, 3);
	}
	
	public double calcularSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
}
