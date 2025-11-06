package OrientacionObjetos1.ejercicio19_AlquilerDePropiedades;

import java.util.LinkedList;
import OrientacionObjetos1.ejercicio17_DateLapse2.DateLapse;


public class Usuario {
	
	private String nombre;
	private String direccion;
	private long dni;
	//Propiedades que posee un propietario y están alquiladas
	private LinkedList<Inmueble> propiedadesEnAlquiler;
	//Propiedades alquiladas por el usuario
	private LinkedList<Reserva> propiedadesAlquiladas;
	
	
	public Usuario(String nombre, String direccion, long dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		propiedadesEnAlquiler = new LinkedList<Inmueble>();
		propiedadesAlquiladas = new LinkedList<Reserva>();
	}
	
	public void crearReserva(DateLapse fecha, Inmueble propiedad) {
		if(propiedad.consultarDisponibilidad(fecha.getFrom(), fecha.getTo())) {
			Reserva reserva = new Reserva(fecha.getFrom(), fecha.getTo());
			propiedadesAlquiladas.add(reserva);
			System.out.println("Propiedad alquilada con exito. Disfrute su estadia");
		}
		else
			System.out.println("Propiedad ocupada para la fecha indicada");
	}
	
	public void cancelarReserva(Reserva reserva){
		if(propiedadesAlquiladas.contains(reserva)) { 
			propiedadesAlquiladas.remove(reserva);
			reserva = null;
		}
	}
	
	
	
}
