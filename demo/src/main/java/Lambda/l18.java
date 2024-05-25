package Lambda;


@FunctionalInterface
interface abab{
	
	void f1();
	
}
public class l18 {

	public static void main(String[] args) {
	
		abab obj = ()-> System.out.println("This is Bangalore");
		obj.f1();
	}
}
