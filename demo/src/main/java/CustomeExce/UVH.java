package CustomeExce;

class hj extends Exception {

	hj(String str) {
		super(str);
	}
}

public class UVH {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static int divide(int a, int b) throws hj {

		if (b == 0) {
			throw new hj("Not Allowed");
		}
		return a / b;
	}
}
