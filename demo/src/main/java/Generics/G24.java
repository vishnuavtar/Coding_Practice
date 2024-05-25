package Generics;

public class G24<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		
		G24<Integer> obj1 = new G24<Integer>();
		
		obj1.f1(10);
		
		G24<String> obj2 = new G24<>();
		
		obj2.f1("Banaglore");
		
	}

}
