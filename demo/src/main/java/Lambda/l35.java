package Lambda;

@FunctionalInterface
interface l35a {

	void f1();
}

public class l35 {

	public static void main(String[] args) {

		l35a obj = () -> System.out.println("This is Hyderabad");
		obj.f1();
	}
}
