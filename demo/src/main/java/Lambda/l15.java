package Lambda;


@FunctionalInterface
interface aaaa{
	
	void f1();
}

public class l15 {

	
	public static void main(String[] args) {
		
		
		aaaa obj1 = ()-> System.out.println("This is Bangalore");
		
		obj1.f1();
		
	}
}
