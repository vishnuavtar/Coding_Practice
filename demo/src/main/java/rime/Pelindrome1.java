package rime;

public class Pelindrome1 {

	public static void main(String[] args) {

		int rev = 0;
		int rem;
		int n = 1123;
		int temp = n;
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n=n/10;

		}
		
		System.out.println(rev);

		if (rev == temp) {
			System.out.println("Pelindrome");
		} else {
			System.out.println("Not Pelindrome");
		}

	}
}