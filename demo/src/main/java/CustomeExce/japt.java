package CustomeExce;

class tpy extends Exception {

	tpy(String str) {
		super(str);
	}
}

public class japt {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws tpy {

		if (b == 0) {
			throw new tpy("Not Allowed");
		}

		return a / b;
	}
}
