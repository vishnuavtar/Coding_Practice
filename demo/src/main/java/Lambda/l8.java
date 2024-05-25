package Lambda;

@FunctionalInterface
interface ll{
	
	void f1();
	
}

public class l8 {
	
	public static void main(String[] args) {
		
		ll obj = () -> System.out.println("This is Bangalore");
		obj.f1();
		
	}

}
