package Lambda;

@FunctionalInterface
interface abcd{
	
	void f1();
	
}


public class l14 {
	
	public static void main(String[] args) {
		
		abcd aa = () -> System.out.println("This is Bangalore");
		
		aa.f1();
		
	}

}
