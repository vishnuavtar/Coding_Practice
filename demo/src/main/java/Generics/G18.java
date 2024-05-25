package Generics;

public class G18<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		
		G18<Integer> obj1 = new G18<Integer>();
		obj1.f1(10);
		
		G18<String> obj2 = new G18<String>();
		obj2.f1("Bangalore");
		
		G18<Character> obj3 = new G18<Character>();
		obj3.f1('A');
		
	}

}
