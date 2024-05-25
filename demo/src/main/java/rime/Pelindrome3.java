package rime;

public class Pelindrome3 {
	
	public static void main(String[] args) {
		
		int a = 12111;
		
		int rem;
		int rev=0;
		
		int temp = a;
		
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
			
		}
		
		System.out.println(rev);
		
		
		if(temp==rev) {
			System.out.println("Pelindrome number");
		}else {
			System.out.println("Not pelindrome");
		}
		
	}

}
