package Lambda;


@FunctionalInterface
interface afag{
	
	void f1();
	
}
public class l28 {

	public static void main(String[] args) {
		
		afag obj = ()-> System.out.println("This is Bangalore");
		obj.f1();
	}
}

