package Generics;

public class G40<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		
		G40<String> obj1 = new G40<String>();
		obj1.f1("Hyderabad");
		
		G40<Integer> obj2 = new G40<Integer>();
		obj2.f1(10);
		
	}

}
