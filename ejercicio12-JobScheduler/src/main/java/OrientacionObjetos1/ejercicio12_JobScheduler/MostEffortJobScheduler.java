package OrientacionObjetos1.ejercicio12_JobScheduler;

public class MostEffortJobScheduler extends JobScheduler {

	public MostEffortJobScheduler() {
		super();
	}
	
	public JobDescription next() {
		JobDescription nextJob = jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                .orElse(null);
            this.unschedule(nextJob);
            return nextJob;
	}
}
