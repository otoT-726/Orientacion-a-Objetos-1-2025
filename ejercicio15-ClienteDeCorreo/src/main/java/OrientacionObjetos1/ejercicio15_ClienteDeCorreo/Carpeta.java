package OrientacionObjetos1.ejercicio15_ClienteDeCorreo;

import java.util.LinkedList;

public class Carpeta {
	
	private String nombre;
	private LinkedList<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new LinkedList<Email>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarEmail(Email email) {
		this.emails.add(email);
	}
	
	public void eliminarEmail(Email email) {
		this.emails.remove(email);
	}
	
	public LinkedList<Email> getEmails(){
		return this.emails;
	}
	
	public void mover(Email email, Carpeta destino) {
		destino.agregarEmail(email);
		this.eliminarEmail(email);
	}
}
