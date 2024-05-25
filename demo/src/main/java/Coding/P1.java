package Coding;

public class P1 {
	
	public static void main(String[] args) {
		
		int rev=0;
		int rem;
		int n =111;
		
		int temp  = n;
		
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		
		if(temp ==rev) {
			System.out.println("Value is pelindrome");
		}else {
			System.out.println("Value is not pelindrome");
		}
		System.out.println(rev);
		
	}

}
