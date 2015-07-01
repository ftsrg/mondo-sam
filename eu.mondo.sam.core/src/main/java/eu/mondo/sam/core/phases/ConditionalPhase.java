package eu.mondo.sam.core.phases;

/**
 * Contains a BenchmarkPhase object and declares an abstract condition method
 * for the subclasses. The inherited classes' responsibility to define a
 * condition which represents a restriction for the access to the phase field.
 * With the usage of a ConditionalPhase that is possible to modify the
 * evaluation order of phases in runtime.
 * 
 * @author Zsolt Kovari
 *
 */
public abstract class ConditionalPhase implements BenchmarkPhase {

	/**
	 * A BenchmarkPhase implementation.
	 */
	protected BenchmarkPhase phase;

	/**
	 * Represents a precondition method for accessing the phase variable.
	 * The subclasses have to define.
	 * 
	 * @return True if the defined condition proves right, or False in the
	 *         other case.
	 */
	public abstract boolean condition();

	/**
	 * Sets the phase field.
	 * 
	 * @param phase
	 *                BenchmarkPhase implementation.
	 */
	public void setPhase(BenchmarkPhase phase) {
		this.phase = phase;
	}

	/**
	 * Returns the phase field.
	 * 
	 * @return a BenchmarkPhase object.
	 */
	public BenchmarkPhase getPhase() {
		return phase;
	}
}
