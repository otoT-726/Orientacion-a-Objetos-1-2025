package OrientacionObjetos1.ejercicio14_VolumenYSuperficie;

public class PrismaRectangular extends Pieza{
	private double ladoMayor;
	private double ladoMenor;
	private double altura;
	
	public PrismaRectangular(String color, String material, double ladoMayor, double ladoMenor, double altura) {
		super(color, material);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	
	
	
	public double getLadoMayor() {
		return ladoMayor;
	}



	public double getLadoMenor() {
		return ladoMenor;
	}



	public double getAltura() {
		return altura;
	}



	public double calcularVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
	
	public double calcularSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
}
