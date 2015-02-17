package eu.mondo.sam.core.phases;

public interface  BenchmarkPhase {

	public BenchmarkPhase nextPhase();
	public boolean hasNext();
}
