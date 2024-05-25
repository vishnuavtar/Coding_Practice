package Inheritance1;

public class Multiple2 implements Abc {

	@Override
	public void f1() {

		System.out.println("This is multple2");

	}
	
	public static void main(String[] args) {
		
		Multiple2 m1 = new Multiple2();
		m1.f1();
	}

}
