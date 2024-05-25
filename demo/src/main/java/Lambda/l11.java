package Lambda;


@FunctionalInterface
interface aabc{
	
	void f1();
}

public class l11 {
	
	public static void main(String[] args) {
		
		aabc obj = ()-> System.out.println("This is Bangalore");
		obj.f1();
	}

}
