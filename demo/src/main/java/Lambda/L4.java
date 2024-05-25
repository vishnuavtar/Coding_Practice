package Lambda;


@FunctionalInterface
interface Aa{
	
	void f1();	
}


public class L4 {


	public static void main(String[] args) {
		Aa obj1 = () -> System.out.println("This is Bangalore");
		obj1.f1();
		
	}
}
