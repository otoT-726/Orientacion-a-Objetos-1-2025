package OrientacionObjetos1.ejercicio5_inversores;
import java.time.LocalDate;
public class InversionEnPlazoFijo extends Inversion{
	private Double montoDepositado;
	private LocalDate fechaDeposito;
	private Double interes;
	
	
	public InversionEnPlazoFijo(double montoDepositado, double interes) {
		this.montoDepositado = montoDepositado;
		this.fechaDeposito = LocalDate.now();
		this.interes = interes;
	}
	
	public Double getValorActual() {
		//Integer cantDias = LocalDate.now() - this.getFechaDeposito(); //?? No se como representar este valor. No es importante para la finalidad del problema asi que lo dejo.
		return this.getMontoDepositado() * this.getInteres();
	}
	
	private Double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	private Double getInteres() {
		return this.interes;
	}
	
	private LocalDate getFechaDeposito() {
		return this.fechaDeposito;
	}
	
	public String toString() {
		return "Plazo fijo con tasa de interes del " + this.getInteres() + "%, monto depositado: " + this.getMontoDepositado() + " en el dia " + this.getFechaDeposito();
	}
}
