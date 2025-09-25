package OrientacionObjetos1.ejercicio9_farolas;
import java.util.LinkedList;
public class Farola {
	private Boolean estado;
	private LinkedList<Farola> vecinas;
	
	public Farola() {
		this.estado = false;
		this.vecinas = new LinkedList<Farola>();
	}
	
	public void agregarVecina(Farola farol) {
		this.vecinas.add(farol);
	}
	public LinkedList<Farola> getNeighbors(){
		return this.vecinas;
	}
	public LinkedList<Farola> getVecinas(){
		return this.vecinas;
	}
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.vecinas.contains(otraFarola)) {
			this.agregarVecina(otraFarola);
			otraFarola.agregarVecina(this);
		}
	}
	public Boolean getEstado() {
		return this.estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	private void prenderApagar(Boolean bool) {
		this.setEstado(bool);
		for(Farola f: this.getVecinas()) {
			f.setEstado(bool);
		}
	}
	
	public void turnOn() {
		if(this.isOff()) 
			this.prenderApagar(true);
	}
	
	public void turnOff() {
		if(this.isOn())
			this.prenderApagar(false);
	}
	
	public Boolean isOn() {
		return this.getEstado();
	}
	public boolean isOff() {
		return !this.getEstado();
	}
	
	
	
}
