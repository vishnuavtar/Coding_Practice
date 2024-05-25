package Exception;

class Asas1 extends Exception {

	Asas1(String str) {
	
	}

}

public class fes12 {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {

		}
	}

	public static int divide(int a, int b) {
		if (b == 0) {
			throw new Asas("Not Allowed");
		}

		return a / b;
	}
}
