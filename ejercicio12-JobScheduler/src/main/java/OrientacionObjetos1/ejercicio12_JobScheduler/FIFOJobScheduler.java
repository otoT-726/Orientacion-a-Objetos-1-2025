package OrientacionObjetos1.ejercicio12_JobScheduler;

public class FIFOJobScheduler extends JobScheduler{
	
	public FIFOJobScheduler() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = jobs.get(0);
		this.unschedule(nextJob);
		return nextJob;
	}
}
