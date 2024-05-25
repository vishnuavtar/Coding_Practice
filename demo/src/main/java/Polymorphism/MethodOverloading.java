package Polymorphism;

public class MethodOverloading {
	
	void f1() {
		System.out.println("This is empty method");
	}
	
	void f1(int a) {
		System.out.println(a);
	}
	
	void f1(int a,int b) {
		System.out.println(a + " " + b);
	}
	
	void f1(char a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		MethodOverloading mm = new MethodOverloading();
		mm.f1();
		mm.f1('a');
		mm.f1(10);
		mm.f1(10, 10);
		
		
	}
}
