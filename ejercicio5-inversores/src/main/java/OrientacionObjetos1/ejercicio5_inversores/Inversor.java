package OrientacionObjetos1.ejercicio5_inversores;
import java.util.LinkedList;
public class Inversor {
	private LinkedList<Inversion> inversiones;

	public Inversor() {
		this.inversiones = new LinkedList<>();
	}
	
	public void agregarInversion(Inversion inversion) {
		this.inversiones.add(inversion);
	}
	
	public void sacarInversion(Inversion inversion) {
		this.inversiones.remove(inversion);
	}
	
	private LinkedList<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	public void listarInversiones() {
		for(Inversion i: getInversiones()) {
			System.out.println(i);
		}
	}
	
	public Double getValorActual() {
		Double total = 0.0;
		for(Inversion i: this.getInversiones()) {
			total += i.getValorActual();
		}
		return total;
	}
}
