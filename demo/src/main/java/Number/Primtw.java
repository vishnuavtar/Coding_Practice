package Number;

public class Primtw {

	public static void main(String[] args) {

		int a = 970;
		boolean flage = false;
		for (int i = 0; i < a / 2; i++) {
			if (a % 2 == 0) {
				flage = true;
			}

		}
		if (!flage) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not");
		}
	}

}
