package Generics;

public class G15<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G15<Integer> obj1 = new G15<Integer>();
		obj1.f1(10);
		
		G15<String> obj2 = new G15<String>();
		obj2.f1("Bangalore");
	}

}
