package Number;

public class Prime11 {

	public static void main(String[] args) {

		int a = 97;
		boolean flage = false;

		for (int i = 0; i < a / 2; i++) {
			if (a % 2 == 0) {
				flage = false;
			}
		}

		if (!flage) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

}
