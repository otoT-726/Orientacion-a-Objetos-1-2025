package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

public abstract class Pieza {
	private String material;
	private String color;
	
	public Pieza(String color, String material) {
		this.color = color;
		this.material = material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public abstract double calcularVolumen();
	public abstract double calcularSuperficie();
}
