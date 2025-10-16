package OrientacionObjetos1.ejercicio11_cuentaAbstracta;

public class CajaDeAhorro extends Cuenta{
	
	private double montoConImpuestos(double monto) {
		return monto - (monto * 0.02);
	}
	
	public boolean puedeExtraer(double monto) {
		if(montoConImpuestos(monto) >= this.getSaldo())
			return true;
		return false;
	}
	
	public void depositar(double monto) {
		super.depositar(montoConImpuestos(monto));
	}
}