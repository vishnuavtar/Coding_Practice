package Generics;

public class G20<T> {
	
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G20<Integer> obj = new G20<Integer>();
		obj.f1(10);
		
		G20<String> obj2 = new G20<>();
		obj2.f1("Bangalore");
		
	}

}
