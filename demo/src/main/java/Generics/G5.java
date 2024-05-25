package Generics;

public class G5<T> {
	
	public void f1(T a) {
		System.out.println(a);
	}
	
	public void f2(T b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		G5<Integer> obj1 = new G5<Integer>();
		obj1.f1(10);
		
		G5<String> obj2 = new G5<String>();
		obj2.f2("Bangalore");
		
	}

}
