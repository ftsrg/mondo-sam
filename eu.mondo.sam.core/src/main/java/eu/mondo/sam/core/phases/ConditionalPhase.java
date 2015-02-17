package eu.mondo.sam.core.phases;

public abstract class ConditionalPhase implements BenchmarkPhase{

	protected BenchmarkPhase phase;
	
	@Override
	public BenchmarkPhase nextPhase() {
		if (condition() == true)
			return (this.phase.nextPhase());
		return null;
	}
		
	public abstract boolean condition();
	
	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}
}
