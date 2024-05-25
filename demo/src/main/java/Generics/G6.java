package Generics;

public class G6<T> {
	
	public void f1(T a) {
		System.out.println(a);
	}
	
	public void f2(T b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		G6<Integer> obj1 = new G6<Integer>();
		obj1.f1(10);
		
		G6<String> obj2 = new G6<String>();
		obj2.f2("Bangalore");
		
	}

}
