package OrientacionObjetos1.ejercicio19_AlquilerDePropiedades;

import java.util.LinkedList;

public class Usuario {
	
	private String nombre;
	private String direccion;
	private long dni;
	
	private LinkedList<Inmueble> propiedadesInteresadas;
	
	public Usuario(String nombre, String direccion, long dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		propiedadesInteresadas = new LinkedList<Inmueble>();
	}
	
	
}
