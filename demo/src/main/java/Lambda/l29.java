package Lambda;

@FunctionalInterface
interface l29a {

	void f1();
}

public class l29 {

	public static void main(String[] args) {

		l29a obj = () -> System.out.println("This is Bangalore");
		obj.f1();
	}
}
