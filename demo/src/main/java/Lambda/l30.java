package Lambda;

@FunctionalInterface
interface l30a {

	void f1();

	default void f2(int n) {
		System.out.println(n);

	}

}

public class l30 {

	
	public static void main(String[] args) {
		
		l30a obj = ()-> System.out.println("This is Bangalore");
		obj.f1();
		obj.f2(10);
	}
}
