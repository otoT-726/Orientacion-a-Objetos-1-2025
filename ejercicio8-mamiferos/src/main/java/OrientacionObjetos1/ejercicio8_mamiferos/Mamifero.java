package OrientacionObjetos1.ejercicio8_mamiferos;
import java.time.LocalDate;
public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero() {}
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getAbueloMaterno() {
		if(this.getMadre() != null)
			return this.getMadre().getPadre();
		return null;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.getMadre() != null)
			return this.getMadre().getMadre();
		return null;
	}
	public Mamifero getAbueloPaterno() {
		if(this.getPadre() != null)
			return this.getPadre().getPadre();
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(this.getPadre() != null)
			return this.getPadre().getMadre();
		return null;
	}
	
	
	public boolean equals(Mamifero unMamifero) {
		return this.getIdentificador().equals(unMamifero.getIdentificador());
	}
	
	
	public Boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(this.getPadre() != null && this.getPadre().equals(unMamifero))
			return true;
		if(this.getMadre() != null && this.getMadre().equals(unMamifero))
			return true;
		return (this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero)) || (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero));
	}
}
