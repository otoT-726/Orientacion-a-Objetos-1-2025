package OrientacionObjetos1.ejercicio12_JobScheduler;

public class LIFOJobScheduler extends JobScheduler{

	public LIFOJobScheduler() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = jobs.get(jobs.size()-1);
        this.unschedule(nextJob);
        return nextJob;
	}
}
