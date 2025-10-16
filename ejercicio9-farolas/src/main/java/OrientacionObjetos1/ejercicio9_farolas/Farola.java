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
	
	public boolean getEstado() {
		return this.estado;
	}
	private void setEstado(Boolean estado) {
		this.estado = estado;
	}	
	
	public void pairWithNeighbor(Farola otraFarola) {
		if(!this.vecinas.contains(otraFarola)) {
			this.agregarVecina(otraFarola);
			otraFarola.agregarVecina(this);
		}
	}
	
<<<<<<< HEAD
	private void prenderApagar(Boolean bool) {
		this.setEstado(bool);
		for(Farola f: this.getVecinas()) {
			f.setEstado(bool);
=======
//	private void prenderApagar(Boolean bool) {
//		this.setEstado(bool);
//		for(Farola f: this.getVecinas()) {
//			f.setEstado(bool);
//		}
//	}
	
	public void turnOn() {
		if(this.isOff()) {
			this.estado = true;
			for(Farola f: this.vecinas){
				f.turnOn();
			}
>>>>>>> 506877e7d792722c9c5b41e73fa87057b43d83f4
		}
	}
	
	public void turnOff() {
		if(this.isOn()) {
			this.estado = false;
			for(Farola f: this.vecinas)
				f.turnOff();
		}
	}
	
	public boolean isOn() {
		return this.getEstado();
	}
	public boolean isOff() {
		return !this.getEstado();
	}
}