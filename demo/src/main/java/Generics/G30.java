package Generics;

public class G30<T> {

	public void f1(T n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		G30<Integer> obj1 = new G30<Integer>();
		obj1.f1(10);

		G30<String> obj2 = new G30<String>();
		obj2.f1("This is Bangalore");

	}

}
