package eu.mondo.sam.core.phases;

public abstract class ConditionalPhase implements BenchmarkPhase{

	protected BenchmarkPhase phase;
	
	
	public abstract boolean condition();
	
	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}
	
	public BenchmarkPhase getPhase() {
		return phase;
	}
}
