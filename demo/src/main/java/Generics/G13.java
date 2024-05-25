package Generics;

public class G13<T> {
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G13<Integer> obj = new G13<Integer>();
		
		obj.f1(10);
		
		G13<String> obj2 = new G13<String>();
		
		obj2.f1("Bangalore");
		
	}

}
