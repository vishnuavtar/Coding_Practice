package Coding;

public class Primeir {

	public static void main(String[] args) {

		int a = 970;

		boolean flage = false;
		;

		for (int i = 2; i < a / 2; i++) {
			if (a % 2 == 0) {
				flage = true;
				break;
			}
		}

		if (!flage) {
			System.out.println("prime");
		} else {
			System.out.println("Not");
		}
	}

}
