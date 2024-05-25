package Generics;

public class G10<T> {
	
	public void f1(T a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		G10<Integer> obj = new G10<Integer>();
		obj.f1(10);
		
		G10<String> obj2 = new G10<String>();
		obj2.f1("Bangalore");
		
	}

}
