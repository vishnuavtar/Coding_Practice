package Inheritance1;

public class Multiple1 implements Abc {

	@Override
	public void f1() {
		System.out.println("This is Multple1");
		
	}
	
	public static void main(String[] args) {
		
		Multiple1 mw2 = new Multiple1();
		mw2.f1();
	}

}
