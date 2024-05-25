package CustomeExce;

class py extends Exception {

	py(String str) {
		super(str);
	}
}

public class Lpt {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

	public static int divide(int a, int b) throws py {

		if (b == 0) {
			throw new py("Not Allowed");
		}

		return a / b;
	}
}
