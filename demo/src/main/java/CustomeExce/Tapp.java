package CustomeExce;

class Dapp extends Exception {

	Dapp(String str) {
		super(str);
	}
}


public class Tapp {

	public static void main(String[] args) {

		try {
			int n = divide(10, 0);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static int divide(int a, int b) throws Dapp {

		if (b == 0) {
			throw new Dapp("Not Allowed");
		}

		return a / b;
	}
}
