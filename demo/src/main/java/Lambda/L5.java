package Lambda;

@FunctionalInterface
interface Ab1{
	
	void f1();
}


public class L5 {
	
	public static void main(String[] args) {
		
		Ab1 obj1 = () -> System.out.print("This is Bangalore");
		obj1.f1();
	}
}
