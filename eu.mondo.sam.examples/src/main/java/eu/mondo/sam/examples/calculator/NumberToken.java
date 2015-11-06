package eu.mondo.sam.examples.calculator;

import eu.mondo.sam.core.DataToken;

public class NumberToken implements DataToken {

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
