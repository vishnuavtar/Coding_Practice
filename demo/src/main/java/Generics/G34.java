package Generics;

public class G34<T> {

	public void f1(T n) {
		System.out.println(n);
	}

	public static void main(String[] args) {

		G34<String> obj1 = new G34<String>();
		obj1.f1("Hyderabad");
		G34<Integer> obj2 = new G34<Integer>();
		obj2.f1(10);

	}

}
