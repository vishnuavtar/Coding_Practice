package Lambda;

@FunctionalInterface
interface L34a {

	void f1();

}

public class L34 {

	public static void main(String[] args) {

		L34a obj = () -> System.out.println("This is Hyderabad");
		obj.f1();
	}
}
