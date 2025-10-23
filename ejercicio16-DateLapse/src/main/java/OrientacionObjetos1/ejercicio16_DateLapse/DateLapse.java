package OrientacionObjetos1.ejercicio16_DateLapse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public long sizeInDays() {
		return from.until(to, ChronoUnit.DAYS);
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