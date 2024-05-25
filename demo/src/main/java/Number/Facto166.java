package Number;

public class Facto166 {

	public static int f1(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * f1(n - 1);
		}
	}

	public static void main(String[] args) {

		int n = 6;

		System.out.println(f1(n));
	}

}
