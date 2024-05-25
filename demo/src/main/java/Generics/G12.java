package Generics;

public class G12<T> {

	
	public void f1(T n) {
		
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		
		G12<Integer> obj1 = new  G12();
		obj1.f1(10);
		
		G12<String> obj2 = new G12();
		obj2.f1("Bangalore");
		
		
	}
}
