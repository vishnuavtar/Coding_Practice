package Generics;

public class G29<T> {

	public void f1(T n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		G29<Integer> obj = new G29<Integer>();
		obj.f1(10);

		G29<String> obj2 = new G29<String>();
		obj2.f1("Bangalore");

	}

}
