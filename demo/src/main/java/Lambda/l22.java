package Lambda;


@FunctionalInterface
interface taa{
	
	void f1();
}

public class l22 {

	
	public static void main(String[] args) {
		
		taa obj = ()-> System.out.println("This is Banaglore");
		obj.f1();
	}
}
