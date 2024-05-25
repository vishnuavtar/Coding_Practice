package rime;

public class PelindromeorNot {
	
	public static void main(String[] args) {
		
		int a = 111112;
		int rem;
		int rev=0;
		
		int temp = a;
		
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
			
		}
		
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("Pelindrome Number");
		}else {
			System.out.println("No Pelindrome Number");
		}
		
	}

}
