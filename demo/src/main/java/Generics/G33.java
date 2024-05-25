package Generics;

public class G33<T> {

	public void f1(T n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		G33<String> obj1 = new G33<String>();
		obj1.f1("Bangalore");

		G33<Integer> obj2 = new G33<Integer>();
		obj2.f1(10);
	}

}
