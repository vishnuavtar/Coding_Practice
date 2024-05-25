package Number;

public class PrimePelindrome {

	public static void main(String[] args) {

		int n = 111;

		//Integer.parseUnsignedInt(new StringBuffer(n).reverse());
		
		
		int rev = 0;
		int rem;

		int temp = n;

		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		System.out.println(rev);

		if (rev == temp) {
			System.out.println("Pelindrome");
		} else {
			System.out.println("Not Pelindrome");
		}
	}

}
