package CustomeExce;

class vt extends Exception {

	vt(String str) {
		super(str);
	}
}

public class tav {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws vt {

		if (b == 0) {
			throw new vt("Not Allowed");
		}

		return a / b;
	}
}
