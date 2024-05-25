package Lambda;


@FunctionalInterface
interface l199{
	
	
	void f1();
}

public class l20 {

	public static void main(String[] args) {
		
		l199 obj = ()->System.out.println("This is Bangalore");
		obj.f1();
	}
}
