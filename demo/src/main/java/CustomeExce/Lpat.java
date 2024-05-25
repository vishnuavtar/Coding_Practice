package CustomeExce;

class ta extends Exception {

	ta(String str) {
		super(str);
	}
}

public class Lpat {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);

			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int divide(int a, int b) throws ta {
		if (b == 0) {
			throw new ta("Not Allowed");
		}

		return a / b;
	}
}
