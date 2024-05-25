package Lambda;


@FunctionalInterface
interface Abc{
	
	void  f1();
}

public class LambdaExpresion {
	
	public static void main(String[] args) {
		
		Abc obj1 = ()->System.out.println("This is Bangalore");
		obj1.f1();
		
	}

}
