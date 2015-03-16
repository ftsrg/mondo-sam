package eu.mondo.sam.test;

import eu.mondo.sam.core.DataToken;

public class TestDataToken implements DataToken{

	private int number;
	
	@Override
	public void init() {
		number = 0;
	}

	@Override
	public void destroy() {
	}

	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
}
