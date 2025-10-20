package OrientacionObjetos1.ejercicio12_JobScheduler;

public class HighestPriorityJobScheduler extends JobScheduler {

	public HighestPriorityJobScheduler() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
            this.unschedule(nextJob);
            return nextJob;
	}

}
