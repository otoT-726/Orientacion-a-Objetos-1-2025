package OrientacionObjetos1.ejercicio17_DateLapse2;

import java.time.LocalDate;

public class DateLapse {
	
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.getFrom().plusDays(sizeInDays);
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate fecha) {
		return fecha.isAfter(this.getFrom()) && fecha.isBefore(this.getTo()) || fecha.isEqual(getFrom()) || fecha.isEqual(getTo());
	}
	
	public boolean overlaps(DateLapse otroDateLapse) {
		for(int i = 0; i < otroDateLapse.sizeInDays(); i++) {
			if(this.includesDate(otroDateLapse.getFrom().plusDays(i)))
				return true;
		}
		return false;
	}
}
