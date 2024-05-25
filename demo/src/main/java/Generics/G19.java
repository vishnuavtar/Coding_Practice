package Generics;

public class G19<T> {

	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		
		G19<Integer> obj1 =  new G19<Integer>();
		obj1.f1(10);
		G19<String> obj2 = new G19<String>();
		obj2.f1("Bangalore");
	}
}
