package Generics;

public class G26<T> {

	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G26<Integer> obj1 = new G26<Integer>();
		obj1.f1(10);
		
		G26<String> obj2 = new G26<String>();
		obj2.f1("Banaglore");
		
	}
}
