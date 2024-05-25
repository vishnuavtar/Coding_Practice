package Lambda;


@FunctionalInterface
interface abc{
	
	void f1();
}

public class l13 {

	
	public static void main(String[] args) {
		
		abc aa = ()-> System.out.println("This is Bangalore");
		aa.f1();
	}
}
