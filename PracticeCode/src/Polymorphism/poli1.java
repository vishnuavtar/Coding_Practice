package Polymorphism;

public class poli1 {
	
	// compile time --> method overloading
	
	public void f1() {
		
		System.out.println("None Parameter method");
		
	}
	
	public void f1(int a) {
		System.out.println("a = " + a);
	}
	
	public void f1(int b, int c) {
		System.out.println("b = " + b + " c = " + c);
	}

	
  public static void main(String[] args) {
	
	  
	  poli1 pp = new poli1();
	  pp.f1();
	  pp.f1(10);
	  pp.f1(20, 30);
}
	
}
