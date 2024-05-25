package Lambda;


@FunctionalInterface
interface AAa{
	
	void f1();
	
}

public class l32 {
	
	public static void main(String[] args) {
		
		AAa obj =  () -> System.out.println("This is Bangalore");
		obj.f1();
		
		
	}

}
