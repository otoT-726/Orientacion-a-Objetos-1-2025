package OrientacionObjetos1.ejercicio15_ClienteDeCorreo;

import java.util.LinkedList;
import java.util.Iterator;

public class ClienteDeCorreo {
	
	Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
	}
	
	public void recibir(Email email) {
		this.inbox.agregarEmail(email);
	}
	
	public Email buscar(String texto) {
		boolean encontre = false;
		Iterator<Email> iter = inbox.getEmails().iterator();
		while(!encontre && iter.hasNext()) {
			Email e = iter.next();
			if(e.getCuerpo().contains(texto) || e.getTitulo().contains(texto)) {
				encontre = true;
				return e;
			}
		}
		return null;
	}
	
	public int espacioOcupado() {
		int total = 0;
		for(Email e: inbox.getEmails()) {
			total += e.calcularTamaño();
		}
		return total;
	}
	
}
