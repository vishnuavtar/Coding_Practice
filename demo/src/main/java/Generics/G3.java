package Generics;

public class G3<T> {
	
	public void f1(int T) {
		
		System.out.println(T);
	}
	
	public void f2(String T) {
		System.out.println(T);
	}
	
	public static void main(String[] args) {
		
		G3<Integer> g = new G3<Integer>();
		g.f1(10);
		G3<String> g1 = new G3<String>();
		g1.f2("Ten");
	}

}
