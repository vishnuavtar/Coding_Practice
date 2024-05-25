package Number;

public class ReverseNumber1 {


	static int rem;
	static int rev;
	
	static int f1(int n) {
		
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(f1(1234));
	}
}
