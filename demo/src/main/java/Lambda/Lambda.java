package Lambda;

@FunctionalInterface
interface aaf {

	void f1();
}

public class Lambda {

	public static void main(String[] args) {

		aaf obj = () -> System.out.println("This is Hyderabad");
		obj.f1(); 
	}
}
