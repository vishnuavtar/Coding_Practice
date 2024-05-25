package Lambda;

@FunctionalInterface
interface al31a {

	void f1();
}

public class l31 {

	public static void main(String[] args) {

		al31a obj = () -> System.out.println("This is Bangalore");

		obj.f1();
	}

}
