package com.spring5;

public class Addition {
	
	private int a;
	public Addition() {
		super();
	}
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		
		System.out.println("Constructor : int , int");
	}
	private int b;
	
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		
		System.out.println("Constructor : double , double");
	}

}
