package Generics;

public class G31<T> {

	public void f1(T n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		G31<Integer> obj1 = new G31<Integer>();
		obj1.f1(10);

		G31<String> obj2 = new G31<String>();
		obj2.f1("Bangalore");

	}

}
