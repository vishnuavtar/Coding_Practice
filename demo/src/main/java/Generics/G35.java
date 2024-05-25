package Generics;

public class G35<T> {

	
	public void f1(T a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		 
		G35<Integer> obj1 = new G35<Integer>();
		obj1.f1(10);
		
		G35<String> obj2 = new G35<String>();
		obj2.f1("Hyderabad");
		
	}
}
