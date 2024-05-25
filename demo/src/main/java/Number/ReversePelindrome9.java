package Number;

public class ReversePelindrome9 {

	public static void main(String[] args) {

		int a = 1112;

		int rev = 0;
		int rem;

		int temp = a;

		while (a > 0) {

			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}

		System.out.println(rev);
		if (rev == temp) {
			System.out.println("Pelindrome");
		} else {
			System.out.println("Not Pelindrome");
		}

	}

}
