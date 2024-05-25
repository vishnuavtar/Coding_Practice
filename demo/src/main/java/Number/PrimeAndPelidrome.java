package Number;

public class PrimeAndPelidrome {

	public static void main(String[] args) {

		int rem;
		int rev = 0;

		int n = 1111;

		int temp = n;
		
		while (n > 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

	System.out.println(rev);
	
	if(temp == rev) {
		System.out.println("Pelindrome");
	}else {
		System.out.println("Not");
	}
	}

}
