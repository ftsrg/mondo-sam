package eu.mondo.sam.proto;

import eu.mondo.sam.core.phases.OptionalPhase;

public class OptionalProtoPhase extends OptionalPhase{
	
	private boolean condition = false;
	
	@Override
	public boolean condition() {
//		Random rand = new Random();
//		int number = rand.nextInt(2);
//		System.out.println(number);
//		if (number == 1){
//			return true;
//		}
		return condition;
	}
	
	public void setCondition(boolean condition) {
		this.condition = condition;
	}

}
