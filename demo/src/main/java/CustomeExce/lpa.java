package CustomeExce;

class pa extends Exception {

	pa(String str) {
		super(str);
	}
}

public class lpa {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws pa {

		if (b == 0) {
			throw new pa("Not Allowed");
		}

		return a / b;
	}
}
