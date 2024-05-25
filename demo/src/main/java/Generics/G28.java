package Generics;

public class G28<T> {
	
	
	public void f1(T n){
		
		System.out.println(n);
	}
	public static void main(String[] args) {
		
		G28<Integer> obj1  = new G28<Integer>();
		obj1.f1(10);
		
		G28<String> obj2 = new G28<String>();
		obj2.f1("Hyderabad");
		
	}
	

}
