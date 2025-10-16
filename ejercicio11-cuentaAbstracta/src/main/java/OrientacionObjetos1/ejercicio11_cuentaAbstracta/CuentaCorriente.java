package OrientacionObjetos1.ejercicio11_cuentaAbstracta;

public class CuentaCorriente extends Cuenta {
	private double limiteDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}
	
	public double getLimiteDescubierto() {
		return this.limiteDescubierto;
	}
	
	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public boolean puedeExtraer(double monto) {
		if(this.getLimiteDescubierto() + this.getSaldo() >= monto)
			return true;
		return false;
	}
	
}
