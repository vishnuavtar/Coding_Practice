package CustomeExce;

class pl extends Exception {

	pl(String str) {
		super(str);
	}
}

public class lapp {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws pl {

		if (b == 0) {
			throw new pl("Not Allowed");
		}

		return a / b;
	}
}
