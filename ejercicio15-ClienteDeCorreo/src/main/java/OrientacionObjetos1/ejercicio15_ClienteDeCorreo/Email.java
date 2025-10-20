package OrientacionObjetos1.ejercicio15_ClienteDeCorreo;

import java.util.LinkedList;

public class Email {
	
	private String titulo;
	private String cuerpo;
	private LinkedList<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.adjuntos = new LinkedList<Archivo>();
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public String getTitulo() {
		return titulo;
	}

	public LinkedList<Archivo> getAdjuntos(){
		return this.adjuntos;
	}
	
	public int calcularTamaño() {
		int total = 0;
		for(Archivo a: adjuntos) {
			total += a.calcularTamaño();
		}
		return total + this.cuerpo.length() + this.titulo.length();
	}
}