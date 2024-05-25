package Lambda;

@FunctionalInterface
interface Abcawe{
	
	void f1();
}

public class Lt {

	public static void main(String[] args) {
		
		Abcawe obj1 = () -> System.out.println("This is f1");
		obj1.f1();
		
	}
}
