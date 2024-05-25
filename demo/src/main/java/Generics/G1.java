package Generics;

public class G1<T> {
	
	public void f1(T a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		G1<Integer> g = new G1<Integer>();
		g.f1(10);
		
		G1<String> g1 = new G1<String>();
		g1.f1("This is a city");
		
		G1<Character> g2 = new G1<Character>();
		g2.f1('A');
		
	}

}
