package CustomeExce;

class pk extends Exception {

	pk(String str) {
		super(str);
	}
}

public class kpp {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws pk {

		if (b == 0) {
			throw new pk("Not Allowed");
		}

		return a / b;
	}
}
