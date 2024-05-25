package Generics;

public class G21<T> {

	
	public void f1(T a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		G21<Integer> obj1 = new G21<Integer>();
		obj1.f1(10);
		
		G21<String> obj2 = new G21<String>();
		obj2.f1("maa");
		
	}
}
