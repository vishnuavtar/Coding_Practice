package Generics;

public class G14<T> {

	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G14<Integer> obj = new G14<Integer>();
		obj.f1(10);
		
		G14<String> obj2 = new G14<String>();
		obj2.f1("Bangalore");
	}
}
