package Generics;

public class G8<T> {
	
	public void f1(T a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		G8<Integer> g = new G8<Integer>();
		g.f1(10);
		G8<String> gg = new G8<String>();
		gg.f1("Vishnu");
		
	}

}
