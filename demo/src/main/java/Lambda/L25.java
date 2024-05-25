package Lambda;

@FunctionalInterface
interface aaabb {

	void f1();

}

public class L25 {

	public static void main(String[] args) {

		aaabb obj = () -> System.out.println("This is Bangalore");

		obj.f1();
	}

}
