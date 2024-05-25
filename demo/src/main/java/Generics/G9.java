package Generics;

public class G9<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G9<Integer> obj = new G9<Integer>();
		G9<String> obj2 = new G9<String>();
		obj.f1(10);
		obj2.f1("Bangalore");
		
	}

}
