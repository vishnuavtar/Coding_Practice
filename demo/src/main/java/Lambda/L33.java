package Lambda;

@FunctionalInterface
interface AAla {

	void f1();
}

public class L33 {

	public static void main(String[] args) {

		AAla obj = () -> System.out.println("This is Bangalore");
		obj.f1();

	}

}
