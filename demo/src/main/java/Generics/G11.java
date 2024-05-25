package Generics;

public class G11<T> {

	public  void f1(T n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		G11<Integer> obj = new G11();
		obj.f1(10);
		

		G11<String> obj2 = new G11();
		obj2.f1("Bangalore");
		
	}

}
