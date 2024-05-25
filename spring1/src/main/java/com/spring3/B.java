package com.spring3;

public class B {
	
	public B(int y) {
		super();
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	public B() {
		super();
	}

	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
