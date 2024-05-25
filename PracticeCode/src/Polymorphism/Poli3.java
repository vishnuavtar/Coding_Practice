package Polymorphism;

public class Poli3 extends Poli2 {
	
	public void f1() {
		System.out.println("This is  poli3");
	}
	
	public static void main(String[] args) {
		
		Poli3 pp = new Poli3();
		pp.f1();
		
		
		Poli2 ppp = new Poli2();
		
		ppp.f1();
		
		
		Poli2 p1 = new Poli3();
		p1.f1();
		
	// Object : - Object is a instance of class.
		
		
	}

}
