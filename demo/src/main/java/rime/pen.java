package rime;

public class pen {
	
	public static void main(String[] args) {
		
		int rev = 0;
		int rem;
		
		int n = 1234;
		int temp;
		temp = n;
		
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
