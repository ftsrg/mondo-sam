package eu.mondo.sam.core.phases;

public abstract class ConditionalPhase implements BenchmarkPhase{

	protected BenchmarkPhase phase;
	
	@Override
	public BenchmarkPhase getPhase() {
		if (condition() == true){
			return (this.phase.getPhase());
			}
		else
			remove();
		return null;
	}
		
	@Override
	public void remove() {
		while(this.phase.hasNext())
			this.phase.remove();
	}
	
	public abstract boolean condition();
	
	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}
}
