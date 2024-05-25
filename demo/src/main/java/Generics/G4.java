package Generics;

public class G4<T> {

	public  void f1(T a) {
		System.out.println(a);
	}
	
	public void f2(T b) {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		G4<Integer> obj1 = new G4<Integer>();
		obj1.f1(10);
		
		G4<String> obj2 = new G4<String>();
		obj2.f1("Bangalore");
		
		
	}
	
}
