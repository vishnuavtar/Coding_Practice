package Lambda;

@FunctionalInterface
interface ll26l {

	void f1();
}

public class l26 {

	public static void main(String[] args) {

		ll26l obj = () -> System.out.println("This is Bangalore");
		obj.f1();
	}
}
