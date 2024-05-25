package Generics;

public class G22<T> {

	
	public void f1(T a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		G22<Integer> obj = new G22<Integer>();
		obj.f1(10);
		
		G22<String> obj2 = new G22<String>();
		obj2.f1("Banaglore");
		
	}
}
