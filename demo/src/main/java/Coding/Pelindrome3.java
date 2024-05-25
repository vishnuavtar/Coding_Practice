package Coding;

public class Pelindrome3 {
	
	public static void main(String[] args) {
		
		int rev = 0;
		int rem;
		int n = 1116;
		
		
		int temp=n;
		
		while(n>0) {
			
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
