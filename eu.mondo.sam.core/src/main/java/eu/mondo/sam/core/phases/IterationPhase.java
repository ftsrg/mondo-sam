package eu.mondo.sam.core.phases;

public class IterationPhase extends ConditionalPhase{

	private int maxIteration;
	private int iteration;
	
	public IterationPhase(int initValue, int maxValue){
		this.iteration = initValue;
		this.maxIteration = maxValue;
	}
	
	@Override
	public boolean condition() {
		if (this.iteration < this.maxIteration){
			if (this.phase.hasNext() == false){
				this.iteration ++;
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean hasNext() {
		if (this.phase.hasNext()) 
			return true;
		else if (this.iteration < this.maxIteration){
			return true;
		}
		return false;
	}
	
	public void setMaxIteration(int maxIteration) {
		this.maxIteration = maxIteration;
	}



	
}
