package Generics;

public class G23<T> {
	
	
	public void f1(T n) {
		System.out.println(n);
	}
	
	
	public static void main(String[] args) {
		
		
		G23<Integer> obj1 = new G23<Integer>();
		obj1.f1(10);
		
		G23<String> obj2 = new G23<String>();
		obj2.f1("Banaglore");
		
		
		
	}

}
