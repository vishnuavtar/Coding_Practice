package Generics;

public class G16<T> {

	public void f1(T n) {
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		
		G16<Integer> obj1 = new G16<Integer>();
		obj1.f1(10);
		G16<String> obj2 = new G16<String>();
		obj2.f1("Bangalore");
	}
}
