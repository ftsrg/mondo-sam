package eu.mondo.sam.core.phases;

public class PhaseInterruptedException extends Exception{

	public PhaseInterruptedException() {
	}
	
	public PhaseInterruptedException(String msg){
		super(msg);
	}
}
