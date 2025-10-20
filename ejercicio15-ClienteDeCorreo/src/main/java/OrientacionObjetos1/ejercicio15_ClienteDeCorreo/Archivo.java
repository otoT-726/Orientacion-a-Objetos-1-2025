package OrientacionObjetos1.ejercicio15_ClienteDeCorreo;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}

	public int calcularTamaño() {
		return nombre.length();
	}
}
