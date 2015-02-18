package eu.mondo.sam.core.phases;

public interface BenchmarkPhase {

	public BenchmarkPhase getPhase();
	public boolean hasNext();
	public void remove();
}
