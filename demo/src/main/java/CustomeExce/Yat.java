package CustomeExce;

class at extends Exception {

	at(String str) {
		super(str);
	}
}

public class Yat {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public static int divide(int a, int b) throws at {

		if (b == 0) {
			throw new at("not allowed");
		}

		return a / b;

	}
}
