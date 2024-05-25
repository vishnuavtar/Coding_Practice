package CustomeExce;

class pt extends Exception {

	pt(String str) {
		super(str);
	}
}

public class ytp {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int divide(int a, int b) throws pt {

		if (b == 0) {
			throw new pt("not allowed");
		}

		return a / b;
	}
}
